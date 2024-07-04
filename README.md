# android-map-keyword

## 📄 프로그램 설명

카카오맵의 클론 코딩을 위해, 검색 레이아웃을 제작하였습니다.

이때 내부 저장소인 SQLite를 통해서 데이터를 검색하고, 기록을 저장하는 기능을 구현합니다.

## 🎯 1단계(로컬 데이터) 구현할 기능

- [X] 검색어를 입력 받고 보여주는 레이아웃 제작

    - [X] 검색어를 입력 받는 EditText 제작

    - [X] X 버튼을 누르면 검색어를 초기화할 수 있도록 ImageButton 제작

    - [X] 검색 결과를 보여주는 레이아웃 제작

    - [X] 이전의 검색 기록을 확인할 수 있는 레이아웃 제작

- [X] 검색에 사용될 데이터를 생성하여 SQLite에 저장

## 🎯 2단계(검색) 구현할 기능

- [ ] X버튼 클릭 시, 입력된 검색어를 지우기

- [ ] 검색어를 입력하면 검색 결과를 띄워 주기

  - [ ] 업종(`COLUMN_CATEGORY`)과 일치한 결과를 DB에서 리스트로 가져오기

  - [ ] 가져온 리스트를 RecyclerView에 적용하여 보여주기

- [ ] 검색 결과 중 하나를 클릭하는 경우, 해당 장소를 검색 기록에 추가하기

  - [ ] 검색 기록을 보여주는 item의 레이아웃 제작하기

  - [ ] 이미 DB에 존재한다면, 해당 값을 지우고 새로 저장해서 맨 뒤로 가도록 구현하기

  - [ ] DB에 존재하지 않는다면, 새롭게 추가하고 맨 뒤에서 불러오기

- [ ] 검색 기록의 X버튼 클릭 시, 해당 검색 기록을 삭제하기