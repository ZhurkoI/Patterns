package org.example.behavioral.interpreter;

public class ApplicationRunner {

    public static void main(String[] args) {
        Expression isContainNumberEight = getNumberEightExpression();
        Expression areMoonsOfMars = getMoonsOfMarsExpression();
        System.out.println("Does Sun system contains 8 planets? -- " + isContainNumberEight.interpret("Sun system contains 8 planets."));
        System.out.println("Are Phobos and Deimos moons of Mars? -- " + areMoonsOfMars.interpret("Phobos and Deimos are moons of Mars."));
    }

    public static Expression getNumberEightExpression() {
        Expression eightWord = new TerminalExpression("eight");
        Expression eightNumber = new TerminalExpression("8");
        return new OrExpression(eightWord, eightNumber);
    }

    public static Expression getMoonsOfMarsExpression() {
        Expression phobos = new TerminalExpression("Phobos");
        Expression deimos = new TerminalExpression("Deimos");
        return new AndExpression(phobos, deimos);
    }
}
