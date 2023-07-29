# Escape Room 密室逃脫
**_結合恐怖音效、驚悚圖案以及益智解謎，讓玩家彷彿身歷密室當中，享受解謎樂趣。_**

## 遊戲預覽（Preview of Game）
<img width="500" alt="front" src="https://github.com/ben03181574/Escape-Room/assets/61927641/149fc7a8-15ca-4df1-8618-f1c719f52463">
<img width="500" alt="setting" src="https://github.com/ben03181574/Escape-Room/assets/61927641/7df0b109-e168-4b93-8146-8f74762d3930">
<img width="500" alt="doll" src="https://github.com/ben03181574/Escape-Room/assets/61927641/ee7717ba-4d8e-4715-b881-adf634323beb">
<img width="500" alt="bathroom" src="https://github.com/ben03181574/Escape-Room/assets/61927641/11ae156b-7a39-4cfa-9729-4137a93a30b0">

## 遊戲規則（Rule of Game）
1. 進入遊戲前，可以於設定中選擇**簡單**或者**困難**模式來進行遊戲。
2. 進入遊戲後，透過**滑鼠點擊**畫面以進行解謎並逃脫密室。
3. 密室共有五個位置，可以透過點擊位於**上下左右**四個方位的**貓掌**以前往不同位置。
4. 遊戲中的氣球關卡，最多只能選錯**兩次**，選錯三次即挑戰失敗
5. 遊戲中的撲克牌關卡，最多只能選錯**兩次**，選錯三次即挑戰失敗
6. 遊戲中如果挑戰失敗，會重新開始，此時可以點選Exit按鈕結束遊戲
7. 成功獲取鑰匙後，**選取鑰匙並點擊大門**即可贏得勝利

## 遊戲執行（Execution of Game）
下載此專案並解壓縮後，雙擊執行 **Game.jar** 檔案，即可執行此遊戲。
>執行環境版本為Java SE8，執行前先確認電腦使否正確安裝Java及版本

## 程式結構（Structure of Game）
1. **Resource** ：此檔案存放此遊戲進行中，所使用的圖片，其包含遊戲背景、道具等圖示之檔案。
2. **Media**：此檔案存放遊戲中所使用的音樂檔案，wav音檔，其中包含遊戲中的摩斯密碼和恐怖娃娃的線索音效。
3. **程式檔**：啟動遊戲、遊戲的介面顯示、遊戲操作與互動。

## 遊戲解答（Solution of Game）
1. 點擊位於床上的枕頭，可以拿到線索**乙卡牌**。
2. 點擊位於冷氣上的紙捲，可以拿到線索**甲卡牌**。
3. 點擊位於電風扇中心隻貓咪，會播放一段摩斯密碼音效，內容為**Heart8**。
4. 點擊位於床上的棉被後並選取Heart8，可以拿到線索**卡牌順序表**。
5. 點擊位於沙發左上方的貓耳並選取出現於左方的紙片，可以拿到線索**卡牌數字轉換表**。
6. 點擊位於浴室中的鏡子（點擊十次）即可將其擊出一大洞，則可以使浴室中地板出現九顆氣球。
7. 點擊位於沙發下方的數獨，並**計算出其值為6**。
8. 點擊位於電視櫃上方的書本，可由其最後一頁的第四行得知「**第三氣球有道具**」。
9. 點擊位於浴室地板的氣球編號3以及編號6，可以拿到工具**釘子**以及線索**密碼卡**。
10. 點擊位於床底下的櫃子，輸入由剛剛密碼卡得知的**密碼3973**，即可獲得一**恐怖娃娃**。
11. 透過釘子點擊恐怖娃娃中的雙眼以及肚子，可以拿到線索**丙卡牌、丁卡牌以及數字箱**。
12. 透過卡牌順序表、卡牌數字轉換表以及甲乙丙丁卡牌，可以得知**密碼為8203**。
13. 點擊數字箱後輸入密碼，可以拿到**大門鑰匙**，點選鑰匙以及大門即可成功逃脫密室。
<img width="500" alt="1" src="https://github.com/ben03181574/Escape-Room/assets/61927641/7aa5e75a-7a93-4c62-9e78-6f53f1a9f777">
<img width="500" alt="2" src="https://github.com/ben03181574/Escape-Room/assets/61927641/57a7c67b-5fa4-44de-ad10-05cf1fd26191">
<img width="500" alt="3" src="https://github.com/ben03181574/Escape-Room/assets/61927641/d471bdc4-d8c2-4652-8a45-cef74b77c5b9">
<img width="500" alt="4" src="https://github.com/ben03181574/Escape-Room/assets/61927641/8d118eae-c33d-435c-84fc-5503ca7ccf9e">
<img width="500" alt="5" src="https://github.com/ben03181574/Escape-Room/assets/61927641/e3f2243e-e36f-41e9-822d-14c2e510de05">
<img width="500" alt="6" src="https://github.com/ben03181574/Escape-Room/assets/61927641/64993577-59a6-4f8b-9943-aba87314f5ab">
<img width="500" alt="7" src="https://github.com/ben03181574/Escape-Room/assets/61927641/fd8f3efb-d23b-437c-80d5-c86347e0420a">
<img width="500" alt="8" src="https://github.com/ben03181574/Escape-Room/assets/61927641/21bb7a5f-d4b4-4eb6-8887-3269410efb47">
