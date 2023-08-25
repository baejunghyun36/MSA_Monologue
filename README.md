# MSA_Monologue
해당 프로젝트에서 다뤄야 할 기술들(숙제) 

## API Gateway

- Discovery Server (Eureka) 활용
- API Gateway (Spring Cloud Gateway) 활용
- API Gateway에서 인증 인가 서버 라우팅 구현
- MSA 아키텍처 서비스 단위로 구성
- 접근 제어 처리하기

## Cache

- Redis 인증 인가 구현 (공유 저장소)
- Redis 접근 제어 처리 (공유 저장소)

## WAS

- ResponseEntity 상태 코드 확실히 적기
- Mapper 활용하여 복잡한 코드 제거
- QueryDSL 활용
- TestCode 작성

## K8s & Docker

- 트래픽 증가 시 K8s를 활용한 Scale Out
- 프로메테우스 + 그라파타 메트릭 정보 수집하여 분석

## Kafka

- 최소 3대 브로커 구성 → 가용성
- 파티션 생성으로 병목현상 제거


## Database 

- Master DB, Slave DB 분리 구현
- 동기화 작업
