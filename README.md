# Account System Management 
> 제로베이스 백엔드 스쿨(백엔드 개발자 부트캠프)에서 진행한 핀테크 관련 개인 프로젝트입니다.
> 
> 진행기간은 24.01.15~ 24.02.19. 총 5주
> 
## 프로젝트 주요 기능

### 1. 회원가입
- 아이디, 비밀번호, 이름, 전화번호를 입력해 가입.
- 아이디, 전화번호는 중복 불가
### 2. 로그인
- 회원가입시 입력한 아이디, 비밀번호로 로그인 가능.
- 로그인 후 다른 기능 사용 가능
- 로그아웃 기능
### 3. 계좌 관리(생성/ 삭제/ 조회)
- 계좌 생성, 삭제 가능
- 삭제 시 데이터베이스에서 삭제하지 않고 삭제 여부 저장.
- 계좌 목록 조회 요청시 본인이 소유한 계좌목록을 확인가능(계좌번호, 잔액 표시)
### 4. 계좌 검색
- 계좌 번호와 이름을 통해 검색 가능.
- 존재하지 않는 계좌일 경우 알맞은 문구 출력 후 검색화면으로 돌아감.
- 검색을 성공하면 본인계좌일 경우 잔액 표시
### 5. 입금, 출금
- 계좌에 금액 입금 가능. 입금시 계좌번호와 이름을 입력.
- 자신의 계좌 금액을 출금할 수 있다. 출금 시 남은 잔액 표시
### 6. 송금 및 입출금 내역 조회
- 본인 계좌 잔액 내에서송금 가능.
- 존재하지 않는 계좌에는 송금할 수 없음.
- 계좌 별 입출금 내역 조회 가능.
- 거래금액, 시간, 대상 확인

## 사용한 기술 
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white">
<img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white">
<img src="https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white">
<img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">

- 라이브러리 : Spring Web, Spring Data JPA, Lombok, Spring Security, JWT, Validation, 

## ERD 데이터 모델링
// 회원 테이블, 계좌 테이블, 거래정보 테이블


