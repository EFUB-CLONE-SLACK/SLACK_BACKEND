package web.slack.config.handlers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;
import web.slack.config.jwt.JwtTokenProvider;
import web.slack.domain.entity.Member;
import web.slack.domain.repository.MemberRepository;
import web.slack.service.MemberService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@Component
@RequiredArgsConstructor
@Slf4j
public class CustomLoginSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    private final MemberRepository memberRepository;
    private final MemberService memberService;

    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException{
        OAuth2User oAuth2User = (OAuth2User) authentication.getPrincipal();
        Member member = findMemberId(oAuth2User);

        getRedirectStrategy().sendRedirect(request, response, makeRedirectUrl(memberService.generateCode(member)));
    }

    private String makeRedirectUrl(String info){
        return UriComponentsBuilder.fromUriString("http://localhost:3090/login" + info).build().toUriString();
    }

    private Member findMemberId(OAuth2User oAuth2User){
        String email = oAuth2User.getAttribute("email");
        return memberRepository.findByEmail(email).get();
    }

}
