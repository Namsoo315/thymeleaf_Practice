package hello.login.domain.member;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.*;

@Slf4j
@Repository
public class MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;      //static 사용

    public Member save(Member member){
        member.setId(++sequence);
        log.info("save member id {}", member);
        store.put(member.getId(), member);
        return member;
    }

    public Member findById(long id){
        return store.get(id);
    }

    public Optional<Member> findByLoginId(String loginId){
        return findAll().stream()
                .filter(m -> m.getLoginId().equals(loginId))
                .findFirst();
    }

    public List<Member> findAll(){
        return new ArrayList<>(store.values());
    }
    
    public void clearStore(){       //테스트 용
        store.clear();
    }
}
