package hello.login.web;

import hello.login.domain.member.Member;
import hello.login.domain.member.MemberRepository;
import hello.login.web.session.SessionManager;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Slf4j
@Controller
@RequiredArgsConstructor
public class HomeController {

    private final MemberRepository memberRepository;
    private final SessionManager sessionManager;

    //    @GetMapping("/")
    public String home() {
        return "home";
    }

//    @GetMapping("/")
    public String homeLogin(@CookieValue(name= "memberId", required = false) Long memberId, Model model){

        if(memberId == null){
            return "home";
        }

        Member loginMember = memberRepository.findById(memberId);
        if(loginMember == null){
            return "home";
        }

        model.addAttribute("member", loginMember);
        return "loginHome";
    }

//    @GetMapping("/")
    public String homeLoginV2(HttpServletRequest request, Model model){

        //세션 관리자에 저장된 회원 정보를 찾아와야함.
        Member member = (Member)sessionManager.getSession(request);

        //로그인
        if(member == null){
            return "home";
        }

        model.addAttribute("member", member);
        return "loginHome";
    }

//    @GetMapping("/")
    public String homeLoginV3(HttpServletRequest request, Model model){

        //홈페이지에 들어가게되면 로그인페이지에 만 들어가도 바로 세션을 생성하기 때문에 false로 먼저 설정.
        HttpSession session = request.getSession(false);

        if(session == null){
            return "home";
        }

        Member loginMember = (Member) session.getAttribute(SessionConst.LOGIN_MEMBER);

        //세션에 데이터 없으면 home
        if(loginMember == null){
            return "home";
        }

        //세션 유지되면 로그인으로 이동
        model.addAttribute("member", loginMember);
        return "loginHome";
    }

    @GetMapping("/")
    public String homeLoginSpring(@SessionAttribute(name = SessionConst.LOGIN_MEMBER, required = false)Member loginMember, Model model){

        //세션에 데이터 없으면 home
        if(loginMember == null){
            return "home";
        }

        //세션 유지되면 로그인으로 이동
        model.addAttribute("member", loginMember);
        return "loginHome";
    }
}