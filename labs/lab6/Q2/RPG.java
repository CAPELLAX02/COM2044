import java.util.Scanner;

public class RPG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Savasacak karakterleri secin:");
        System.out.println("1. Savasci");
        System.out.println("2. Buyucu");
        System.out.println("3. Tank");

        System.out.print("ilk karakteri secin (1-3): ");
        int firstChoice = scanner.nextInt();

        System.out.print("ikinci karakteri secin (1-3): ");
        int secondChoice = scanner.nextInt();

        Character firstCharacter = createCharacter(firstChoice);
        Character secondCharacter = createCharacter(secondChoice);

        System.out.println("Dovus basliyor!");

        boolean firstCharactersTurn = true;

        while (firstCharacter.getHealthPoints() > 0 && secondCharacter.getHealthPoints() > 0) {
            if (firstCharactersTurn) {
                firstCharacter.attack(secondCharacter);
            } else {
                secondCharacter.attack(firstCharacter);
            }
            firstCharactersTurn = !firstCharactersTurn;
        }

        if (firstCharacter.getHealthPoints() <= 0) {
            System.out.println(firstCharacter.getClass().getSimpleName() + " yenildi! " + secondCharacter.getClass().getSimpleName() + " kazandi!");
        } else {
            System.out.println(secondCharacter.getClass().getSimpleName() + " yenildi! " + firstCharacter.getClass().getSimpleName() + " kazandi!");
        }

        System.out.println("Dovus bitti!");
    }

    public static Character createCharacter(int choice) {
        return switch (choice) {
            case 1 -> new Warrior(80, 30, 5);
            case 2 -> new Mage(100, 20, 10);
            case 3 -> new Tank(150, 15, 20);
            default -> {
                System.out.println("Gecersiz Secim! Varsayilan olarak Savasci secildi.");
                yield new Warrior(80, 30, 5);
            }
        };
    }
}

abstract class Character {
    protected int healthPoints;
    protected int attackPower;
    protected int defensePower;

    public Character(int healthPoints, int attackPower, int defensePower) {
        this.healthPoints = healthPoints;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
    }

    public abstract void attack(Character opponent);
    public abstract void defend(int incomingAttack);

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}

class Warrior extends Character {
    public Warrior(int healthPoints, int attackPower, int defensePower) {
        super(healthPoints, attackPower, defensePower);
    }

    @Override
    public void attack(Character opponent) {
        System.out.println("Savasci saldiriyor! " + opponent.getClass().getSimpleName() + " " + attackPower + " hasar aldi.");
        opponent.defend(attackPower);
    }

    @Override
    public void defend(int incomingAttack) {
        int damage = incomingAttack - defensePower;
        if (damage < 0) damage = 0;
        healthPoints -= damage;
        System.out.println("Savasci savunuyor! " + damage + " hasar aldi. Saglik: " + (Math.max(healthPoints, 0)));
    }
}

class Mage extends Character {
    public Mage(int healthPoints, int attackPower, int defensePower) {
        super(healthPoints, attackPower, defensePower);
    }

    @Override
    public void attack(Character opponent) {
        System.out.println("Buyucu saldiriyor! " + opponent.getClass().getSimpleName() + " " + attackPower + " hasar aldi.");
        opponent.defend(attackPower);
    }

    @Override
    public void defend(int incomingAttack) {
        int damage = incomingAttack - defensePower;
        if (damage < 0) damage = 0;
        healthPoints -= damage;
        System.out.println("Buyucu savunuyor! " + damage + " hasar aldi. Saglik: " + (Math.max(healthPoints, 0)));
    }
}

class Tank extends Character {
    public Tank(int healthPoints, int attackPower, int defensePower) {
        super(healthPoints, attackPower, defensePower);
    }

    @Override
    public void attack(Character opponent) {
        System.out.println("Tank saldiriyor! " + opponent.getClass().getSimpleName() + " " + attackPower + " hasar aldi.");
        opponent.defend(attackPower);
    }

    @Override
    public void defend(int incomingAttack) {
        int damage = incomingAttack - defensePower;
        if (damage < 0) damage = 0;
        healthPoints -= damage;
        System.out.println("Tank savunuyor! " + damage + " hasar aldi. Saglik: " + (Math.max(healthPoints, 0)));
    }
}