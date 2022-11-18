package ru.mirea.workeightteen.task2;

interface AbstractChairFactory {
    VictorianChair createVictorianChair();

    MagicChair createMagicChair();

    FunctionalChair createFunctionalchair();
}
