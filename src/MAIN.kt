fun main()
{
    //Приветствие игроку и правила игры
    println("Добро пожаловать....")
    println("Правила победы....")
    println("Правила поражения....")


    //Начальные параметры
    var points = 0
    var life = 2
    var answer = 0 //Пустой ответ


    //Список вопросов
    var question1 = ""
    var question2 = ""
    var question3 = ""
    var question4 = ""
    var question5 = ""
    var question6 = ""
    var question7 = ""
    var question8 = ""
    var question9 = ""
    var question10 = ""


    //Структура вопроса
    println(question1) // Задается вопрос
    answer = readLine()!!.toInt() // Ожидается ответ
    /*if () или when()*/

    when(answer) //Условия правильного ответа
    {
        1 -> {println("Сообщение"); points++} //Правильный ответ
        2 -> {println("Сообщение"); life--} //Неравильный ответ
        3 -> {println("Сообщение"); life--} //Неправильный ответ
        4 -> {println("Сообщение"); life--} //Неправильный ответ
        else -> {println("Сообщение");life--} //Обработка ошибки
    }









}
