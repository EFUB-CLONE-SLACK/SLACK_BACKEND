# SLACK 클론코딩 프로젝트

[![Hits](https://hits.seeyoufarm.com/api/count/incr/badge.svg?url=https://github.com/EFUB-CLONE-SLACK/SLACK_BACKEND&count_bg=%23FF7B72&title_bg=%23555555&icon=&icon_color=%23E7E7E7&title=hits&edge_flat=false)](https://hits.seeyoufarm.com)

## 🍏 백엔드 팀원 소개

<table border="1" cellspacing="0" cellpadding="0" width="90%">
    <tr width="100%">
        <td width="30%" align="center"><a href= "https://github.com/siyeonkm">김시연</a></td>
        <td width="30%" align="center"><a href= "https://github.com/eunseo22mv">김은서</a></td>
        <td width="30%" align="center"><a href= "https://github.com/sunnyineverywhere">이선의</a></td>
    </tr>
    <tr width="100%">
        <td width="30%" align="center"><img src = "https://github.com/Bakery-EFUB/Bakery-Back/blob/develop/siyeonKim.png" width="80%"/></td>
        <td width="30%" align="center"><img src = "https://github.com/Bakery-EFUB/Bakery-Back/blob/develop/siyeonKim.png" width="80%"/></td>
        <td width="30%" align="center"><img src = "https://github.com/Bakery-EFUB/Bakery-Back/blob/develop/siyeonKim.png" width="80%"/></td>
    </tr>
    <tr width="100%">
       <td width="30%" align="center">[로그인] 카카오 로그인, JWT 토큰을 이용한 로그인 유지, 유저별 접근권한 설정 
          </br> [웹소켓] 어쩌구
          </br> [기타] 데이터베이스 설계, 리드미 작성 등.</td>
       <td width="30%" align="center">[기능] 제안서 작성, 제안서 일자 수정, 제안서 조회, 제안서 리스트 조회 기능 등 
          </br> [댓글] 댓글 및 대댓글 작성, 삭제, 조회 기능 등
          </br> [기타] 데이터베이스 설계, api 문서 작성 등</td>
        <td width="30%" align="center">[기능] 제안서 작성, 제안서 일자 수정, 제안서 조회, 제안서 리스트 조회 기능 등 
          </br> [댓글] 댓글 및 대댓글 작성, 삭제, 조회 기능 등
          </br> [기타] 데이터베이스 설계, api 문서 작성 등</td>
   </tr>
</table>


## 🍰 개요
'CAKER'는 레터링 케이크 주문/판매 플랫폼으로, 레터링 케이크를 주문하고자 하는 구매자와 그에 맞는 서비스를 제공하는 판매자를 서로 연결해주어 기존의 불편함을 해소하고 원하는 케이크 가게를 손쉽게 찾게 해줍니다.

## 🍰 기술 스택    
- DEVELOP &nbsp; 
![Spring](https://img.shields.io/badge/Spring-6DB33F?style=round-square&logo=Spring&logoColor=white) <img src="https://img.shields.io/badge/MySQL-4479A1?style=flat-square&logo=MySQL&logoColor=white"/> <img src="https://img.shields.io/badge/Kakao-FFCD00?style=flat-square&logo=Kakao&logoColor=white"/>

- AWS &nbsp;
<img src="https://img.shields.io/badge/Amazon AWS-232F3E?style=flat-square&logo=Amazon%20AWS&logoColor=white"/> <img src="https://img.shields.io/badge/Amazon S3-569A31?style=flat-square&logo=AmazonS3&logoColor=white"/> <img src="https://img.shields.io/badge/Amazon EC2-FF9900?style=flat-square&logo=Amazon EC2&logoColor=white"/> <img src="https://img.shields.io/badge/Amazon RDS-527FFF?style=flat-square&logo=Amazon RDS&logoColor=white"/> <img src="https://img.shields.io/badge/Amazon LoadBalancer-E68B49?style=flat-square&logo=Amazon LoadBalancer&logoColor=white"/> <img src="https://img.shields.io/badge/Amazon CodeDeploy-7D9B4B?style=flat-square&logo=Amazon CodeDeploy&logoColor=white"/>

- ETC &nbsp; 
<img src="https://img.shields.io/badge/GitHub -181717?style=flat-square&logo=GitHub&logoColor=white"/> <img src="https://img.shields.io/badge/GitHub Action-256EE0?style=flat-square&logo=GitHub Action&logoColor=white"/></br>

<img src="https://user-images.githubusercontent.com/99666136/183558301-95416e18-9b6f-455b-a02c-1878840cae5f.png"/>

## 🍰 라이브러리
1. lombok
2. spring web
3. spring data jpa
4. oauth2 client
5. spring boot test
6. spring session jdbc
7. spring security test
8. amazon awssdk
9. spring cloud aws
10. mysql driver

## 🍰 프로젝트 구조

### 설명
1. main/java/[프로젝트명]/config ▶️ security 및 cors 설정
2. main/java/[프로젝트명]/controller ▶ Controller
3. main/java/[프로젝트명]/domain ▶️ Entity
4. main/java/[프로젝트명]/dto ▶️ request와 response dto
5. main/java/[프로젝트명]/exception ▶️ 커스텀 ErrorHandler
6. main/java/[프로젝트명]/respository ▶️ Repository
7. main/java/[프로젝트명]/service ▶️ Service
8. main/java/[프로젝트명]/Application.java
9. main/resources/application.properties ▶️ session 관련 설정
10. main/resources/application-aws.properties ▶️ aws 관련 설정
11. main/resources/application-oauth.properties ▶️ kakao login 관련 설정

### 🍰 폴더 
<pre>
<code>
└── 🗂 main
    ├── 🗂 java
    │   └── 🗂 com
    │       └── 🗂 bakery
    │           └── 🗂 caker
    │               ├── 📑 Application.java
    │               ├── 🗂 config
    │               │   ├── 📑 Authority.java
    │               │   ├── 📑 OAuth2SuccessHandler.java
    │               │   ├── 📑 JwtAuthenticationFilter.java
    │               │   ├── 📑 SecurityCOnfig.java
    │               │   └── 📑 WebConfig.java
    │               ├── 🗂 controller
    │               │   ├── 📑 EventController.java
    │               │   ├── 📑 MemberController.java
    │               │   ├── 📑 SheetController.ja
    │               │   └── 📑 StoreController.java
    │               ├── 🗂 domain
    │               │   ├── 📑 BaseTimeEntity.java
    │               │   ├── 📑 Comment.java
    │               │   ├── 📑 Event.java
    │               │   ├── 📑 Member.java
    │               │   ├── 📑 Recomment.java
    │               │   ├── 📑 Sheet.java
    │               │   └── 📑 Store.java
    │               ├── 🗂 dto ── 생략
    │               ├── 🗂 exception
    │               │   ├── 📑 CustomException.java
    │               │   ├── 📑 ErrorCode.java
    │               │   ├── 📑 ErrorResponse.java
    │               │   └── 📑 GlobalExceptionHandler.java
    │               ├── 🗂 repository
    │               │   ├── 📑 CommentRepository.java
    │               │   ├── 📑 EventRepository.java
    │               │   ├── 📑 MemberRepository.java
    │               │   ├── 📑 RecommentRepository.java
    │               │   ├── 📑 SheetRepository.java
    │               │   └── 📑 StoreRepository.java
    │               ├── 🗂 service
    │               │   ├── 📑 CommentService.java
    │               │   ├── 📑 EventService.java
    │               │   ├── 📑 ImageUploadService.java
    │               │   ├── 📑 MemberService.java
    │               │   ├── 📑 OAuthUserService.java
    │               │   ├── 📑 SheetService.java
    │               └── └── 📑 StoreService.java
    └── 🗂 resources
        ├── 📑 application.properties
        ├── 📑 application-aws.properties
        └── 📑 application-oauth.properties
</code>
</pre>


## 🍰 데이터베이스 설계도(E-R diagram)
<img src = "https://github.com/Bakery-EFUB/Bakery-Back/blob/develop/erd-diagram.PNG"/>

## 🍰 API 명세서
### [🔗 Link](https://www.notion.so/efub/API-6461422a295b47ee831e14a51340c2a0)


