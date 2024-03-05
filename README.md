## 기능 요구 사항

### 플레이어 이름 입력

1. 플레이어의 이름은 ","을 기준으로 구분한다.
2. 플레이어의 이름은 길이가 1 이상이어야 한다.
3. 플레이어의 이름은 알파벳 대소문자와 숫자로만 구성되어야 한다.
4. 플레이어의 이름은 중복되면 안된다.

### 플레이어 및 딜러 점수 계산

1. 플레이어가 소유한 카드의 점수의 합이 플레이어의 점수다.
2. 카드의 점수는 카드의 숫자로 계산한다.
3. Ace 카드는 1 혹은 11 중 카드의 소유자가 더 유리한 것으로 계산한다.
4. King, Queen, Jack은 각각 10으로 계산한다.

### 게임 진행 규칙

1. 모든 플레이어와 딜러는 카드를 2장씩 가지고 시작한다.
2. 플레이어는 서로 돌아가면서 자기 턴을 가진다.
3. 플레이어는 자신의 턴에 자신이 카드를 더 받을지 말지 선택할 수 있다. 단, 자신의 점수가 21 이상인 경우 카드를 더 받을 수 없다.
4. 플레이어는 한 번 카드를 받지 않기로 결정한 경우, 앞으로의 턴에서 카드를 더 받을 수 없다.
5. 모든 플레이어가 카드를 더 받을 수 없는 경우, 딜러의 턴으로 넘어간다.
6. 딜러의 턴에서 딜러는 딜러의 점수가 16점 이하인 경우 카드를 더 받는다. 17점 이상인 경우 카드를 더 받지 않는다.
7. 딜러의 턴이 끝나면, 최종 점수 계산 및 게임의 승패를 가린다.
8. 최종 점수가 21점에 가장 가까우면서 21점을 넘기지 않는 사람이 승리한다. 동점인 플레이어(딜러 포함)이 나온 경우, 무승부로 판단한다.

### 게임 진행 상황 출력

1. 게임이 시작 되자마자, 딜러와 플레이어가 받은 카드를 출력한다.
2. 단, 딜러는 카드를 한장만 출력한다.
3. 이 후 플레이어의 차례마다 플레이어가 소유한 카드를 출력한다.

### 게임 결과 출력

1. 게임을 완료한 후 각 플레이어(딜러 포함)가 보유한 카드 및 점수를 출력한다.
2. 게임을 완료한 후 각 플레이어별로 승패를 출력한다.
    - 딜러는 다른 모든 플레이어에 대한 승패가 출력된다.
    - 딜러가 아닌 플레이어는 딜러에 대한 승패가 출력된다.

### 게임 진행 가이드 출력

- 게임의 원활한 진행을 위해 가이드 문구를 출력한다.

## 기능 목록

- [ ] 플레이어 이름 입력 기능
- [x] 카드 점수 계산 기능
- [ ] Ace 카드 점수 보정 기능
- [ ] 플레이어 턴 진행 기능
- [ ] 플레이어 및 딜러 점수 계산 기능
- [ ] 딜러 턴 진행 기능
- [ ] 게임 결과 출력 기능
- [ ] 게임 진행 상황 출력 기능
- [x] 덱 관리 기능
