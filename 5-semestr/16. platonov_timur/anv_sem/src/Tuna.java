/**
 * ВАРИАНТ 16.
 * Задача. «Общество защиты тунцов» [2, с.113-115].
 * Инструменты. Таблицы символов (словари) [7, стр.475-489]. Реализация:
 * Деревья цифрового поиска (ДСТ-деревья) [7, стр.602-607].
 */

public class Tuna {
    private Dictionary goodguys = new Dictionary(), badguys = new Dictionary();

    public void favour(String friend) {
        goodguys.insert(friend);
        badguys.delete(friend);
    }

    public void unfavour(String foe) {
        goodguys.delete(foe);
        badguys.insert(foe);
    }

    public void report(String subject) {
        if (goodguys.isContained(subject)) {
            System.out.println(subject + " is a good guy :)");
        }
        else if (badguys.isContained(subject)) {
            System.out.println(subject + " is a bad guy :(");
        }
        else {
            System.out.println("No information about " + subject);
        }
    }
}
