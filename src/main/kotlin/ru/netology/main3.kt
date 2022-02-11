package ru.netology

fun main() {
    val firstPurchase = 90000
    val secondPurchase = 35000
    val basicDiscount = 10000
    val extendedDiscountRate = 0.95
    val regularUser = true
    val regularUserDiscountRate = 0.99
    val message = "Стоимость с учетом всех скидок составила: "

    println("Покупка 1: " + firstPurchase / 100 + " рублей " + firstPurchase % 100 + " копеек")
    var totalPurchase = firstPurchase /*
    Здесь мы определяем, какие покупки составят сумму предыдущих. В нашем случае это первая покупка.
    var используется, т.к. может изменяться по мере добавления новых покупок
    */
    println("Покупка 2: " + secondPurchase / 100 + " рублей " + secondPurchase % 100 + " копеек")
    val discountedCost = if (totalPurchase in 100101..999999) secondPurchase - basicDiscount else (secondPurchase * extendedDiscountRate)
    //Определяем цену со скидкой в зависимости от суммы покупок - базовая минус 100 или расширенная 5 процентов
    val regularUserDiscountedCost = if (totalPurchase <= 100000) (secondPurchase * regularUserDiscountRate).toInt() else (discountedCost.toInt() * regularUserDiscountRate).toInt()
    //Определяем цену для постоянного клиента, скидка либо от цены покупки, либо от цены покупки уже со скидкой
    val finalDiscountedCost = if (regularUser) regularUserDiscountedCost else discountedCost.toInt()
    //Определяем финальную цену - либо с простой скидкой, либо с доп скидкой для постоянного клиента
    if (totalPurchase <= 100000 && regularUser == false) {
        println(message + secondPurchase / 100 + " рублей " + secondPurchase % 100 + " копеек")
    } else if (totalPurchase <= 100000 && regularUser == true){
        println(message + regularUserDiscountedCost / 100 + " рублей " + regularUserDiscountedCost % 100 + " копеек")
    } else println(message + finalDiscountedCost / 100 + " рублей " + finalDiscountedCost % 100 + " копеек")
}