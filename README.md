# Escape Room 密室逃脫
**_結合恐怖音效、驚悚圖案以及益智解謎，讓玩家彷彿身歷密室當中，享受解謎樂趣。_**

## 遊戲預覽（Preview of Game）
<img width="500" alt="front" src="https://github.com/ben03181574/Java_Escape-Room/assets/61927641/7333ba74-1b1d-43aa-9300-9a501f198400">
<img width="500" alt="setting" src="https://github.com/ben03181574/Java_Escape-Room/assets/61927641/2fe7cdfa-1295-45e2-a03e-4153409015c3">
<img width="500" alt="doll" src="https://github.com/ben03181574/Java_Escape-Room/assets/61927641/250b68a6-3ba5-4aa7-bf7a-b38e73bbf5b1">
<img width="500" alt="bathroom" src="https://github.com/ben03181574/Java_Escape-Room/assets/61927641/eb158337-7dc0-4975-93b5-431ac3a1d04d">

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
<img width="500" alt="1" src="https://github.com/ben03181574/Java_Escape-Room/assets/61927641/f4626add-4f62-491c-a589-a7034b23ebe1">
<img width="500" alt="2" src="https://github.com/ben03181574/Java_Escape-Room/assets/61927641/110c2d20-fdae-4c8d-a48c-84de71c514e4">
<img width="500" alt="3" src="https://github.com/ben03181574/Java_Escape-Room/assets/61927641/888d615c-8095-4b25-b153-da234ca815eb">
<img width="500" alt="4" src="https://github.com/ben03181574/Java_Escape-Room/assets/61927641/9ca5abe4-303b-4210-b5b0-fdbfc3bf0042">
<img width="500" alt="5" src="https://github.com/ben03181574/Java_Escape-Room/assets/61927641/a6478115-1f48-48ec-add9-1f82bb9b9753">
<img width="500" alt="6" src="https://github.com/ben03181574/Java_Escape-Room/assets/61927641/1d55a965-3e0e-4fce-9be4-228577518dd1">
<img width="500" alt="7" src="https://github.com/ben03181574/Java_Escape-Room/assets/61927641/483666b3-f526-41e4-a872-430f60fba2ac">
<img width="500" alt="8" src="https://github.com/ben03181574/Java_Escape-Room/assets/61927641/521e903c-6589-48ce-9d73-1b66d8438f9c">
