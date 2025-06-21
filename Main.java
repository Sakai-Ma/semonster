public class Main {
  public static void main(String[] args) {
    System.out.println("SEMonster!");
    // Playerクラスのインスタンスを生成
    Player player = new Player();
    // モンスターを引く処理
    player.drawMonsters();
    // デッキの中身を表示する処理
    player.showDeck();
  }
}
