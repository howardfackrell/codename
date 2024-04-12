package hlf;

import java.util.Random;

public class CodenameGenerator {

  private static Random random = new Random();
  private static String[] adjectives = {
    "small", "big", "large", "old", "young", "happy", "sad", "angry", "easy", "difficult",
    "fast", "slow", "hot", "cold", "good", "bad", "bright", "dark", "rich", "poor",
    "heavy", "light", "hard", "soft", "strong", "weak", "high", "low", "near", "far",
    "loud", "quiet", "clean", "dirty", "empty", "full", "new", "old", "early", "late",
    "long", "short", "narrow", "wide", "thick", "thin", "simple", "complex", "safe", "dangerous",
    "important"
  };

  private static String[] nouns = {
    "house", "car", "tree", "dog", "book", "chair", "city", "door", "hand", "picture",
    "bird", "window", "table", "mountain", "river", "box", "street", "grass", "rain", "flower",
    "pen", "earth", "cloud", "plane", "sun", "star", "heart", "ocean", "moon", "dream",
    "cat", "watch", "leaf", "ball", "cup", "wind", "voice", "fire", "foot", "hair",
    "light", "milk", "air", "money", "music", "road", "arm", "love", "food", "art",
    "water"
  };

  public static int fourDigits() {
    return 1000 + random.nextInt(9000);
  }

  public static String generateCodename() {
    return adjectives[random.nextInt(adjectives.length)]
        + "-"
        + nouns[random.nextInt(nouns.length)]
        + "-"
        + fourDigits();
  }
}
