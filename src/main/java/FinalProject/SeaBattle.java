package FinalProject;


import java.util.*;

public class SeaBattle {
    public static void main(String[] args) {
        System.out.println("Для начала игры напиши в консоль Старт или Start");
        Scanner start = new Scanner(System.in);
        while (true) {
            String begin = start.nextLine();
            if (begin.equals("Старт") || begin.equals("Start")) {
                System.out.println("Игра началась");
                break;
            }
        }

        System.out.println("Введите имя первого игрока:");
        String player1 = start.nextLine();
        SeaPiece[][] seaPiecePlayer1 = new SeaPiece[10][10];
        SeaField seaFieldPlayer1 = new SeaField(seaPiecePlayer1, player1);
        declarationPlayer(seaPiecePlayer1, seaFieldPlayer1, player1);

        System.out.println("Введите имя второго игрока:");
        String player2 = start.nextLine();
        SeaPiece[][] seaPiecePlayer2 = new SeaPiece[10][10];
        SeaField seaFieldPlayer2 = new SeaField(seaPiecePlayer2, player2);
        declarationPlayer(seaPiecePlayer2, seaFieldPlayer2, player2);

        System.out.println("Игроки расставили свои корабли!\n" +
                "Битва начинается!");
        System.out.println("Для того чтобы решить, кто будет ходить первым, каждый игрок должен ввести число от 0 до 10.\n" +
                "Чье число будет ближе к загаданному, тот и ходит первым");
        int num1;
        int num2;
        while (true) { // вводим числа и определяем правильность введения чисел
            try {
                System.out.println(player1 + ", введи число:");
                Scanner number = new Scanner(System.in);
                int num1While = number.nextInt();
                if (num1While < 1 || num1While > 10) {
                    throw new NumberFormatException();
                }
                num1 = num1While;
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Нужно ввести число от 1 до 10");
                continue;
            }
            while (true) {
                try {
                    System.out.println(player2 + ", введи число:");
                    Scanner number = new Scanner(System.in);
                    int num2While = number.nextInt();
                    if (num2While < 1 || num2While > 10) {
                        throw new NumberFormatException();
                    }
                    num2 = num2While;
                } catch (NumberFormatException | InputMismatchException e) {
                    System.out.println("Нужно ввести число от 1 до 10");
                    continue;
                }
                break;
            }
            break;
        }

        Random random = new Random();
        int randomNumber = random.nextInt(11);
        String firstPlayer;                             // создаем строки и массивы чтобы перенести их в метод battle
        SeaPiece[][] seaPieceFirstPlayer;
        SeaField seaFieldFirstPlayer;
        String secondPlayer;
        SeaPiece[][] seaPieceSecondPlayer;
        SeaField seaFieldSecondPlayer;
        System.out.println("Выпало число " + randomNumber);
        if (Math.abs(randomNumber - num1) < Math.abs(randomNumber - num2)) {
            System.out.println("Первым ходит игрок " + player1);
            firstPlayer = player1;
            secondPlayer = player2;
            seaPieceFirstPlayer = seaPiecePlayer1;
            seaFieldFirstPlayer = seaFieldPlayer1;
            seaPieceSecondPlayer = seaPiecePlayer2;
            seaFieldSecondPlayer = seaFieldPlayer2;
        } else {
            System.out.println("Первым ходит игрок " + player2);
            firstPlayer = player2;
            secondPlayer = player1;
            seaPieceFirstPlayer = seaPiecePlayer2;
            seaFieldFirstPlayer = seaFieldPlayer2;
            seaPieceSecondPlayer = seaPiecePlayer1;
            seaFieldSecondPlayer = seaFieldPlayer1;
        }
        battle(firstPlayer, seaPieceFirstPlayer, seaFieldFirstPlayer, secondPlayer, seaPieceSecondPlayer, seaFieldSecondPlayer);
    }


    public static void declarationPlayer(SeaPiece[][] seaPiece, SeaField seaField, String player) { // метод создания игрока
        System.out.println("Приветствуем игрока - " + player + "!");
        System.out.println("Теперь игрок " + player + " должен расставить свои корабли");
        seaField.print();
        System.out.println("Введите координаты четырехпалубного корабля (формат: x,y;x,y;x,y;x,y)");
        deckShip(seaPiece, 4);
        seaField.print();

        System.out.println("Введите координаты первого трехпалубного корабля ((формат: x,y;x,y;x,y)");
        deckShip(seaPiece, 3);
        seaField.print();
        System.out.println("Введите координаты второго трехпалубного корабля ((формат: x,y;x,y;x,y)");
        deckShip(seaPiece, 3);
        seaField.print();

        System.out.println("Введите координаты первого двухпалубного корабля ((формат: x,y;x,y)");
        deckShip(seaPiece, 2);
        seaField.print();
        System.out.println("Введите координаты второго двухпалубного корабля ((формат: x,y;x,y)");
        deckShip(seaPiece, 2);
        seaField.print();
        System.out.println("Введите координаты третьего двухпалубного корабля ((формат: x,y;x,y)");
        deckShip(seaPiece, 2);
        seaField.print();

        System.out.println("Введите координаты первого однопалубного корабля ((формат: x,y)");
        deckShip(seaPiece, 1);
        seaField.print();
        System.out.println("Введите координаты второго однопалубного корабля ((формат: x,y)");
        deckShip(seaPiece, 1);
        seaField.print();
        System.out.println("Введите координаты третьего однопалубного корабля ((формат: x,y)");
        deckShip(seaPiece, 1);
        seaField.print();
        System.out.println("Введите координаты четвертого однопалубного корабля ((формат: x,y)");
        deckShip(seaPiece, 1);
        seaField.print();

        System.out.println("Корабли расставлены!");
    }

    public static void deckShip(SeaPiece[][] seaPieces, int quantity) { //метод создания корабля, принемает на вход массив поля, и количество элеементов корабля
        try {
            Scanner ship = new Scanner(System.in);
            String coordinates = ship.nextLine();
            String[] numbers = coordinates.split(";"); //получаем массив из введеных координат, каждая ячейка массива содержит 2 координаты
            if (numbers.length != quantity) {
                throw new ValueExeption();
            }
            List<Integer> intShip = new ArrayList<>();
            for (int i = 0; i < numbers.length; i++) { // создаем список из чисел со всеми координатами
                String[] oneElement = numbers[i].split(",");
                for (int j = 0; j < oneElement.length; j++) {
                    intShip.add(Integer.parseInt(oneElement[j]));
                }
            }
            int count = 0;
            for (int i = 0; i < numbers.length * 2; i += 2) {//проверяем список, чтобы он соответствовал условию
                count++;
                if (count == quantity) {
                    break;
                }
                if (intShip.get(0).equals(intShip.get(i + 2)) && Math.abs(intShip.get(i + 1) - intShip.get(i + 3)) == 1) {
                    continue;
                } else if (intShip.get(1).equals(intShip.get(i + 3)) && Math.abs(intShip.get(i) - intShip.get(i + 2)) == 1) {
                    continue;
                } else {
                    throw new ValidException();
                }
            }
            for (int i = 0; i < numbers.length * 2; i += 2) {
                if (seaPieces[intShip.get(i + 1)][intShip.get(i)] != SeaPiece.EMPTY) {
                    throw new IllegalArgumentException();
                }
            }
            for (int i = 0; i < numbers.length * 2; i += 2) { //в этой цепочке циклов, помещаем корабль на поле и создаем вокруг него ореол
                seaPieces[intShip.get(i + 1)][intShip.get(i)] = SeaPiece.SHIP;
                for (int j = -1; j < 2; j++) {
                    for (int k = -1; k < 2; k++) {
                        try {
                            if (seaPieces[(intShip.get(i + 1)) + k][(intShip.get(i)) + j] == SeaPiece.EMPTY) {
                                seaPieces[(intShip.get(i + 1)) + k][(intShip.get(i)) + j] = SeaPiece.OREO;
                            }
                        } catch (IndexOutOfBoundsException e) {
                            continue;
                        }

                    }
                }
            }
        } catch (ValidException e) {
            System.out.println("Координаты ввдедены не верно!");
            System.out.println("Попробуйте ввести снова:");
            deckShip(seaPieces, quantity);
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели буквы вместо цифр");
            System.out.println("Попробуйте ввести снова:");
            deckShip(seaPieces, quantity);
        } catch (ValueExeption valueExeption) {
            System.out.println("Вы указали корабль не верного размера");
            System.out.println("Попробуйте ввести снова:");
            deckShip(seaPieces, quantity);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Вы указали координаты за пределам поля");
            System.out.println("Попробуйте ввести снова:");
            deckShip(seaPieces, quantity);
        } catch (IllegalArgumentException e) {
            System.out.println("На указанных координатах нельзя размещать корабль (уже имеется корабль или ореол корабля)");
            System.out.println("Попробуйте ввести снова:");
            deckShip(seaPieces, quantity);
        }
        // 0,3;0,4;0,5;0,6

    }

    public static void battle(String firstPlayer, SeaPiece[][] seaPieceFirstPlayer, SeaField seaFieldFirstPlayer, String secondPlayer, SeaPiece[][] seaPieceSecondPlayer, SeaField seaFieldSecondPlayer) {
        SeaPiece[][] seaPieceFirstPlayerEmpty = new SeaPiece[10][10]; // создаем новый массив и поле для отображения поподаний на чистом поле
        SeaField seaFieldFirstPlayerEmpty = new SeaField(seaPieceFirstPlayerEmpty, firstPlayer);
        SeaPiece[][] seaPieceSecondPlayerEmpty = new SeaPiece[10][10];
        SeaField seaFieldSecondPlayerEmpty = new SeaField(seaPieceSecondPlayerEmpty, secondPlayer);

        while (true) {

            int countFirstToWin = 0;
            for (int i = 0; i < seaPieceSecondPlayer.length; i++) { // в начале проверяем поле противоположного игрока, если не осталось караблей выводим сообщение о попбеде и программа завершается
                for (int j = 0; j < seaPieceSecondPlayer[i].length; j++) {
                    if (seaPieceSecondPlayer[i][j] != SeaPiece.SHIP) {
                        continue;
                    } else {
                        countFirstToWin++;
                    }
                }
            }
            if (countFirstToWin == 0) {
                System.out.println("Все корабли уничтожены! Игрок " + firstPlayer + " победил! Игра звершена.");
                break;
            }

            int countSecondToWin = 0;
            for (int i = 0; i < seaPieceFirstPlayer.length; i++) { //тоже со вторым игроком
                for (int j = 0; j < seaPieceFirstPlayer[i].length; j++) {
                    if (seaPieceFirstPlayer[i][j] != SeaPiece.SHIP) {
                        continue;
                    } else {
                        countSecondToWin++;
                    }
                }
            }
            if (countSecondToWin == 0) {
                System.out.println("Все корабли уничтожены! Игрок " + secondPlayer + " победил! Игра звершена.");
                break;
            }
            seaFieldSecondPlayerEmpty.print();
            int countGotIt = 0;
            int[] shotFirst = shoot(firstPlayer);
            if (seaPieceSecondPlayer[shotFirst[1]][shotFirst[0]] == SeaPiece.SHIP) {
                seaPieceSecondPlayer[shotFirst[1]][shotFirst[0]] = SeaPiece.KILLED;
                seaPieceSecondPlayerEmpty[shotFirst[1]][shotFirst[0]] = SeaPiece.KILLED;
                for (int i = 1; i < 5; i++) {
                    try {
                        if (seaPieceSecondPlayer[shotFirst[1] + i][shotFirst[0]] == SeaPiece.KILLED) {
                            continue;

                        } else if (seaPieceSecondPlayer[shotFirst[1] + i][shotFirst[0]] == SeaPiece.SHIP) {
                            countGotIt++;
                            break;
                        } else {
                            break;
                        }
                    } catch (IndexOutOfBoundsException e) {
                        break;
                    }
                }
                for (int i = 1; i < 5; i++) {
                    try {
                        if (seaPieceSecondPlayer[shotFirst[1] - i][shotFirst[0]] == SeaPiece.KILLED) {
                            continue;
                        } else if (seaPieceSecondPlayer[shotFirst[1] - i][shotFirst[0]] == SeaPiece.SHIP) {
                            countGotIt++;
                            break;
                        } else {
                            break;
                        }
                    } catch (IndexOutOfBoundsException e) {
                        break;
                    }
                }
                for (int i = 1; i < 5; i++) {
                    try {
                        if (seaPieceSecondPlayer[shotFirst[1]][shotFirst[0] + i] == SeaPiece.KILLED) {
                            continue;
                        } else if (seaPieceSecondPlayer[shotFirst[1]][shotFirst[0] + i] == SeaPiece.SHIP) {
                            countGotIt++;
                            break;
                        } else {
                            break;
                        }
                    } catch (IndexOutOfBoundsException e) {
                        break;
                    }
                }
                for (int i = 1; i < 5; i++) {
                    try {
                        if (seaPieceSecondPlayer[shotFirst[1]][shotFirst[0] - i] == SeaPiece.KILLED) {
                            continue;
                        } else if (seaPieceSecondPlayer[shotFirst[1]][shotFirst[0] - i] == SeaPiece.SHIP) {
                            countGotIt++;
                            break;
                        } else {
                            break;
                        }
                    } catch (IndexOutOfBoundsException e) {
                        break;
                    }
                }

                if (countGotIt > 0) {
                    System.out.println("Попал!");
                    continue;
                } else {
                    System.out.println("Убил!");
                    continue;
                }
            } else if (seaPieceSecondPlayer[shotFirst[1]][shotFirst[0]] == SeaPiece.MISSING || seaPieceSecondPlayer[shotFirst[1]][shotFirst[0]] == SeaPiece.KILLED) {
                System.out.println("Мимо!");
            } else {
                seaPieceSecondPlayerEmpty[shotFirst[1]][shotFirst[0]] = SeaPiece.MISSING;
                System.out.println("Мимо!");
            }

            while (true) {
                seaFieldFirstPlayerEmpty.print();
                int countSecondToWinDOUBLE = 0;
                for (int i = 0; i < seaPieceFirstPlayer.length; i++) {
                    for (int j = 0; j < seaPieceFirstPlayer[i].length; j++) {
                        if (seaPieceFirstPlayer[i][j] != SeaPiece.SHIP) {
                            continue;
                        } else {
                            countSecondToWinDOUBLE++;
                        }
                    }
                }
                if (countSecondToWinDOUBLE == 0) {
                    break; // если кораблей не осталось, прекращаем этот цикл и переходим в родительский и игра завершается
                }
                int countGotItTwo = 0;
                int[] shotSecond = shoot(secondPlayer);
                if (seaPieceFirstPlayer[shotSecond[1]][shotSecond[0]] == SeaPiece.SHIP) {
                    seaPieceFirstPlayer[shotSecond[1]][shotSecond[0]] = SeaPiece.KILLED;
                    seaPieceFirstPlayerEmpty[shotSecond[1]][shotSecond[0]] = SeaPiece.KILLED;

                    for (int i = 1; i < 5; i++) {
                        try {
                            if (seaPieceFirstPlayer[shotSecond[1] + i][shotSecond[0]] == SeaPiece.KILLED) {
                                continue;
                            } else if (seaPieceFirstPlayer[shotSecond[1] + i][shotSecond[0]] == SeaPiece.SHIP) {
                                countGotItTwo++;
                                break;
                            } else {
                                break;
                            }
                        } catch (IndexOutOfBoundsException e) {
                            break;
                        }
                    }
                    for (int i = 1; i < 5; i++) {
                        try {
                            if (seaPieceFirstPlayer[shotSecond[1] - i][shotSecond[0]] == SeaPiece.KILLED) {
                                continue;
                            } else if (seaPieceFirstPlayer[shotSecond[1] - i][shotSecond[0]] == SeaPiece.SHIP) {
                                countGotItTwo++;
                                break;
                            } else {
                                break;
                            }
                        } catch (IndexOutOfBoundsException e) {
                            break;
                        }
                    }

                    for (int i = 1; i < 5; i++) {
                        try {
                            if (seaPieceFirstPlayer[shotSecond[1]][shotSecond[0] + i] == SeaPiece.KILLED) {
                                continue;
                            } else if (seaPieceFirstPlayer[shotSecond[1]][shotSecond[0] + i] == SeaPiece.SHIP) {
                                countGotItTwo++;
                                break;
                            } else {
                                break;
                            }
                        } catch (IndexOutOfBoundsException e) {
                            break;
                        }
                    }

                    for (int i = 1; i < 5; i++) {
                        try {
                            if (seaPieceFirstPlayer[shotSecond[1]][shotSecond[0] - i] == SeaPiece.KILLED) {
                                continue;
                            } else if (seaPieceFirstPlayer[shotSecond[1]][shotSecond[0] - i] == SeaPiece.SHIP) {
                                countGotItTwo++;
                                break;
                            } else {
                                break;
                            }
                        } catch (IndexOutOfBoundsException e) {
                            break;
                        }
                    }
                    if (countGotItTwo > 0) {
                        System.out.println("Попал!");
                    } else {
                        System.out.println("Убил!");
                    }
                    continue;
                } else if (seaPieceFirstPlayer[shotSecond[1]][shotSecond[0]] == SeaPiece.MISSING || seaPieceFirstPlayer[shotSecond[1]][shotSecond[0]] == SeaPiece.KILLED) {
                    System.out.println("Мимо!");
                    break;
                } else {
                    seaPieceFirstPlayerEmpty[shotSecond[1]][shotSecond[0]] = SeaPiece.MISSING;
                    System.out.println("Мимо!");
                    break;
                }
            }

        }
    }

    public static int[] shoot(String player) { //метод выстрела по полю
        try {
            System.out.println("Игрок " + player + " введи координаты выстрела (формат: x,y):");
            Scanner scanner = new Scanner(System.in);
            String shot = scanner.nextLine();
            String[] numbers = shot.split(",");
            int[] xY = new int[2];
            xY[0] = Integer.parseInt(numbers[0]);
            xY[1] = Integer.parseInt(numbers[1]);
            if (xY[0] < 0 || xY[0] > 9 || xY[1] < 0 || xY[1] > 9) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return xY;
        } catch (NumberFormatException e) {
            System.out.println("Координаты ввдедены не верно!");
            return shoot(player);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вы указали координаты за пределам поля");
            System.out.println("Попробуйте ввести снова:");
            return shoot(player);
        }
    }
}




