package Basic;

class ShowWord {

    // Synchronized display method to prevent multiple threads from accessing it simultaneously
      void display(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
    }

}

class ContainWord extends Thread {
    ShowWord sw;

    public ContainWord(ShowWord sw) {
        this.sw = sw;
    }

    public void run() {
        sw.display("Hello");
    }
}

class ContainWord2 extends Thread {
    ShowWord sw;

    public ContainWord2(ShowWord sw) {
        this.sw = sw;
    }

    public void run() {
        sw.display("WelcomeMynameisChaitali");
    }
}

public class ShowMul {

    public static void main(String[] args) {
        ShowWord sw = new ShowWord();
        ContainWord containWord = new ContainWord(sw);
        ContainWord2 containWord2 = new ContainWord2(sw);
        containWord2.setDaemon(true);
        containWord2.start();
        containWord.start();
    }
}
