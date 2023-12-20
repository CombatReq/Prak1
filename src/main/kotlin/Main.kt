
    fun main(args: Array<String>) {
// Задание 1
        println("Введите сумму перевода:")
        val amount = readln().toInt()
        val stock : Int = 35
        val proc = 0.75
        var stock1 = (amount/100)*proc
        if(stock1 < stock)
        {
            println("комиссия:${stock} руб")
        }
        else {
            println("комиссия:${stock1} руб")
        }
        // Задание 2

        println("Введите число лайков:")
        val like = readln().toInt()
        if (like%10 !=  1)
        {
            println("Понравилось " + like + " Людям")
        }
        else {
            println("Понравилось " + like + " Человеку")
        }
        // Задание 3

        println("Введите сумму:")
        val  sum = readln().toDouble()
        println("Введите информацию - постоянный ли клиент? (выбор: true(да) или false(нет)):")
        val  pos = readln().toBoolean()
        var cost = 0
        var costproc = 0.0
        var costproc1 = 0.0
        if (sum<=1000)
        {
            println("${sum} руб")
        }
        if (1001<=sum && sum <=10000)
        {
            cost = 100
            println("${sum-cost} руб - скидка 100 руб")
        }
        if (sum >10000)
        {
            if (pos != true) {
                costproc = 0.05
                println("${sum - (sum * costproc)} руб - скидка ${costproc}")
            }
            else
            {
                costproc = 0.05
                costproc1 = 0.01
                var discount = sum-(sum * costproc)
                var discount2 = discount-(discount * costproc1)
                println("${discount2} руб - скидка 5% и 1% сверху")
            }
        }


    }

