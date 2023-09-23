## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```
---
### 요구사항
- 직선인 경우 두 점 사이 거리를 계산해서 출력한다.
- 정상적인 좌표값을 입력한 경우, 해당 좌표에 특수문자를 표시
- X, Y좌표 모두 최대 24까지 입력가능
- 입력 범위를 초과할 경우 에러 문구를 출력하고 다시 입력받는다.
- 사각형
    - 네 점이 뒤틀어진 사다리꼴이나 마름모는 제외하고 직사각형만 허용
  - 삼각형
    - 좌표값을 세 개 입력한 경우, 세 점을 연결하는 삼각형으로 가정한다.

### 계산공식
- 두 점사이 거리 = 제곱근((A.x - B.x)^제곱 +(A.y - B.y)^제곱)
- 사각형 면적 = width*height
- 삼각형 면적 = 헤론의 공식

### TODO
- [ ] 좌표계산기
    - [x] 점 클래스 설계
    - [x] 도형 인터페이스 설계
    - [ ] 선 길이
    - [ ] 사각형 면적
    - [ ] 삼각형 면적
    - [ ] 입력값 파서
    - [ ] 계산클래스 구현
    - [x] 도형 생성 팩토리 구현
- [ ] 입출력
    - [ ] 입력받기
    - [ ] 좌표 출력 그리기
- [ ] 좌표계산기 어플리케이션 클래스 구현
