package hello.login.web.login;

import hello.login.domain.login.LoginService;
import hello.login.domain.member.Member;
import hello.login.web.SessionConst;
import hello.login.web.session.SessionManager;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;
    private final SessionManager sessionManager;

    @GetMapping("/login")
    public String loginForm(@ModelAttribute LoginForm form) {
        return "login/loginForm";
    }

//    @PostMapping("/login")
//    public String login(@ModelAttribute LoginForm form, BindingResult br, HttpServletResponse response){
//        if(br.hasErrors()){
//            return "login/loginForm";
//        }
//
//        Member loginMember = loginService.login(form.getLoginId(), form.getPassword());
//        log.info("loginMember={}", loginMember);
//
//        if(loginMember == null){
//            br.reject("loginFail", "아이디 또는 비밀번호가 맞지 않습니다.");
//            return "login/loginForm";
//        }
//
//        //로그인 성공 처리 TODO
//
//        //세션 쿠키 (브라우저 종료시 쿠키 삭제)
//        Cookie idCookie = new Cookie("memberId", String.valueOf(loginMember.getId()));
//        response.addCookie(idCookie);
//        return "redirect:/";
//
//    }
//    @PostMapping("/login")
    public String loginV2(@ModelAttribute LoginForm form, BindingResult br, HttpServletResponse response){
        if(br.hasErrors()){
            return "login/loginForm";
        }

        Member loginMember = loginService.login(form.getLoginId(), form.getPassword());
        log.info("loginMember={}", loginMember);

        if(loginMember == null){
            br.reject("loginFail", "아이디 또는 비밀번호가 맞지 않습니다.");
            return "login/loginForm";
        }

        //로그인 성공 처리 TODO

        //세션 관리자를 통해 세션을 생성하고 보관하면 됨.
        sessionManager.createSession(loginMember, response);

        return "redirect:/";

    }

//    @PostMapping("/login")
    public String loginV3(@ModelAttribute LoginForm form, BindingResult br, HttpServletRequest request){
        if(br.hasErrors()){
            return "login/loginForm";
        }

        Member loginMember = loginService.login(form.getLoginId(), form.getPassword());
        log.info("loginMember={}", loginMember);

        if(loginMember == null){
            br.reject("loginFail", "아이디 또는 비밀번호가 맞지 않습니다.");
            return "login/loginForm";
        }

        //로그인 성공 처리 TODO

        //세션 관리자를 통해 세션을 생성하고 보관하면 됨.
        HttpSession session = request.getSession();

        //세션의 로그인 회원 정보를 보관
        session.setAttribute(SessionConst.LOGIN_MEMBER, loginMember);

        return "redirect:/";

    }

    @PostMapping("/login")
    public String loginV4(@ModelAttribute LoginForm form, BindingResult br,
                          @RequestParam(defaultValue = "/") String redirectURL,
                          HttpServletRequest request){
        if(br.hasErrors()){
            return "login/loginForm";
        }

        Member loginMember = loginService.login(form.getLoginId(), form.getPassword());
        log.info("loginMember={}", loginMember);

        if(loginMember == null){
            br.reject("loginFail", "아이디 또는 비밀번호가 맞지 않습니다.");
            return "login/loginForm";
        }

        //로그인 성공 처리 TODO

        //세션 관리자를 통해 세션을 생성하고 보관하면 됨.
        HttpSession session = request.getSession();

        //세션의 로그인 회원 정보를 보관
        session.setAttribute(SessionConst.LOGIN_MEMBER, loginMember);

        return "redirect:" + redirectURL;

    }

//    @PostMapping("/logout")
//    public String logout(HttpServletResponse response){
//        expireCookie(response, "memberId");
//        return "redirect:/";
//    }
//    @PostMapping("/logout")
    public String logoutV2(HttpServletRequest request){
        sessionManager.expire(request);
        return "redirect:/";
    }

    @PostMapping("/logout")
    public String logoutV3(HttpServletRequest request){
        HttpSession session = request.getSession(false);
        if (session != null){
            //세션안에 있는 데이터가 전부 날라감.
            session.invalidate();
        }
        return "redirect:/";
    }


    private static void expireCookie(HttpServletResponse response, String cookieName) {
        Cookie cookie = new Cookie(cookieName, null);
        cookie.setMaxAge(0);
        response.addCookie(cookie);
    }
}
