# kotlin-lotto

## STEP 1

## 문자열 덧셈 계산기

## 기능 요구 사항

- 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
- 앞의 기본 구분자(쉼표, 콜론) 외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 예를 들어 “//;\n1;2;3”과
  같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
- 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw 한다.

- [X] 빈 문자열 또는 null 값을 입력할 경우 0을 반환해야 한다.
- [X] 숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다.
- [X] 숫자 두개를 쉼표(,) 구분자로 입력할 경우 두 숫자의 합을 반환한다.
- [X] 구분자를 쉼표(,) 이외에 콜론(:)을 사용할 수 있다.
- [X] //와 \\n 문자 사이에 커스텀 구분자를 지정할 수 있다.
- [X] 문자열 계산기에 음수를 전달하는 경우 RuntimeException 예외 처리를 한다.

## STEP2

## 로또(자동)

## 기능 요구사항

- 구매
  - [ ] 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.

- 예산
  - [X] 로또 1장의 가격은 1000원이다.
  - [X] 예산을 생성할 수 있다
  - [X] 예산을 입력하면 구매 가능한 로또 갯수를 출력한다.
  - [X] 예산에 음수를 입력하면 예외를 던진다.

- 로또
  - [X] 로또 숫자를 랜덤하게 중복없이 6개 추출한다.
  - [X] 추출 번호는 오름차순으로 정렬되어 표시 된다.
  - [X] 로또는 6개 로또 번호를 가지고 있다.
  - [X] 로또는 로또갯수가 올바르지 않으면 예외를 던진다.

- 로또 번호
  - [X] 숫자를 입력받아 로또 번호를 생성할 수 있다.
  - [X] 1 ~ 45 사이 숫자가 아니라면 예외를 던진다.

- 당첨
  - [ ] 당첨번호를 , 를 기준으로 중복없이 6개 숫자를 입력받는다.
  - [ ] 당첨은 동일한 번호가 3개이상 ~ 6개까지 이다.
  - [ ] 총 수익률을 보여준다.
  - [ ] 당첨 일치 갯수와 당첨 금액을 리턴한다

### 실행결과

```
구입금액을 입력해 주세요.
14000
14개를 구매했습니다.
[8, 21, 23, 41, 42, 43]
[3, 5, 11, 16, 32, 38]
[7, 11, 16, 35, 36, 44]
[1, 8, 11, 31, 41, 42]
[13, 14, 16, 38, 42, 45]
[7, 11, 30, 40, 42, 43]
[2, 13, 22, 32, 38, 45]
[23, 25, 33, 36, 39, 41]
[1, 3, 5, 14, 22, 45]
[5, 9, 38, 41, 43, 44]
[2, 8, 9, 18, 19, 21]
[13, 14, 18, 21, 23, 35]
[17, 21, 29, 37, 42, 45]
[3, 8, 27, 30, 35, 44]

지난 주 당첨 번호를 입력해 주세요.
1, 2, 3, 4, 5, 6

당첨 통계
---------
3개 일치 (5000원)- 1개
4개 일치 (50000원)- 0개
5개 일치 (1500000원)- 0개
6개 일치 (2000000000원)- 0개
총 수익률은 0.35입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)
```

## 프로그래밍 요구 사항

- 모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외
  - 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
  - UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
- indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
  - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
  - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메서드)를 분리하면 된다.
- 함수(또는 메서드)의 길이가 10라인을 넘어가지 않도록 구현한다.
  - 함수(또는 메서드)가 한 가지 일만 잘 하도록 구현한다. 
