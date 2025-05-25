package Module9;

import java.util.ArrayList;
import java.util.List;

public abstract class VideoGameConsole {
    private double hardDriveSize;
    private double ramSize;
    private ArrayList<String> supportedGames;

    public VideoGameConsole() {
        hardDriveSize = 512;
        ramSize = 16;
        supportedGames = new ArrayList<>(List.of("Tetris"));
    }

    public VideoGameConsole(double hardDriveSize, double ramSize, ArrayList<String> supportedGames) {
        this.hardDriveSize = hardDriveSize;
        this.ramSize = ramSize;
        this.supportedGames = supportedGames;
    }

    public void getConsoleSpecs() {
        String sb = "Hard Drive " + hardDriveSize + "\n" +
                "Ram size " + ramSize + "\n" +
                "Supported Games " + supportedGames + "\n";
        System.out.println(sb);
    }

    public void runVideoGame() {
        System.out.println("Begin playing video game");
    }

    public abstract void installVideoGame();

    public abstract void deleteVideoGame();
}
