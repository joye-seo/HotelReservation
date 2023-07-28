package com.example.hotelreservation.reservation

import java.util.Scanner

data class MenuItem(val name: String, val price: Int)
data class MenuItem2(val name: String)

fun showMenu(items: List<MenuItem>) {
    items.forEachIndexed { index, item -> println(" ${index + 1}. ${item.name} | ${item.price}원 ") }
    println(" ${items.size + 1}. 뒤로가기 ")
}

fun showMenu2(items: List<MenuItem2>) {
    items.forEachIndexed { index, item -> println(" ${index + 1}. ${item.name} ") }
    println(" ${items.size + 1}. 뒤로가기 ")
}

fun main() {
    val scan = Scanner(System.`in`)

    while (true) {
        println("안녕하세요 투썸플레이스입니다.")
        println("주문을 하시려면 1번을 눌러주세요")
        println(" 1. 주문하기 ")
        println(" 2. 프로그램 종료 ")

        val choice1 = scan.nextInt()
        scan.nextLine()

        when (choice1) {
            1 -> {
                println(" 주문하기를 누르셨습니다. ")
                println(" 매장 이용방법을 선택해주세요")
                println(" 1. 매장식사 ")
                println(" 2. 포장하기 ")
                println(" 3. 프로그램 종료")

                val choice2 = scan.nextInt()
                scan.nextLine()

                when (choice2) {
                    in 1..2 -> {
                        val categories = listOf(
                            "Coffee", "Non - Coffee", "Ade", "Smoothie", "Tea", "Desert"
                        )
                        println(" 아래의 메뉴판을 보시고 메뉴를 골라 입력해주세요 ")
                        println()
                        showMenu2(categories.map { MenuItem2(it) })

                        val choice3 = scan.nextInt()
                        scan.nextLine()

                        when (choice3) {
                            in 1..categories.size -> {
                                val menuItems = when (categories[choice3 - 1]) // list의 값이 0부터 할당되므로 입력값 - 1

                                {
                                    "Coffee" -> listOf(
                                        MenuItem("에스프레소", 3000), MenuItem("아메리카노(Ice)", 3500),
                                        MenuItem("아메리카노(Hot)", 3000), MenuItem("카페라떼(Hot)", 4000),
                                        MenuItem("카페라떼(Ice)", 4500), MenuItem("카푸치노(Hot)", 4000),
                                        MenuItem("카푸치노(Ice)", 4500)
                                    )

                                    "Non - Coffee" -> listOf(
                                        MenuItem("초코라떼(Hot)", 4000), MenuItem("초코라떼(Ice)", 4500),
                                        MenuItem("그린티라떼(Hot)", 4000), MenuItem("그린티라떼(Ice)", 4500),
                                        MenuItem("고구마라떼(Hot)", 4500), MenuItem("고구마라떼(Ice)", 5000)
                                    )

                                    "Ade" -> listOf(
                                        MenuItem("레몬에이드", 5000), MenuItem("레몬에이드", 5000),
                                        MenuItem("딸기에이드", 5000), MenuItem("블루베리에이드", 5500)
                                    )

                                    "Smoothie" -> listOf(
                                        MenuItem("요거트스무디", 5500), MenuItem("딸기스무디", 5500),
                                        MenuItem("망고스무디", 5500), MenuItem("블루베리스무디", 6000)
                                    )

                                    "Tea" -> listOf(
                                        MenuItem("페퍼민트(Hot)", 5500), MenuItem("페퍼민트(Ice)", 5500),
                                        MenuItem("캐모마일(Hot)", 5500), MenuItem("캐모마일(Ice)", 6000),
                                        MenuItem("녹차(Hot)", 5500), MenuItem("녹차(Ice)", 6000)
                                    )

                                    "Desert" -> listOf(
                                        MenuItem("허니브레드", 8000), MenuItem("치즈케이크", 8500),
                                        MenuItem("딸기케이크", 8500), MenuItem("당근케이크", 8000)
                                    )

                                    else -> emptyList()
                                }
                                println(" ${categories[choice3 - 1]}의 상세 메뉴입니다. ")
                                println()
                                showMenu(menuItems)

                                println(" 메뉴를 선택해주세요 ")
                                val choseMenu = scan.nextInt()
                                scan.nextLine()
                                if (choseMenu in 1..menuItems.size) {
                                    val selectedMenuItem = menuItems[choseMenu - 1]
                                    println("${selectedMenuItem.name}를 선택하셨습니다.")
                                    println("가격: ${selectedMenuItem.price}원")
                                } else {
                                    println("잘못된 선택입니다.")
                                }
                            }

                            categories.size + 1 -> {
                                // 뒤로가기
                            }

                            else -> {
                                println("잘못된 선택입니다.")
                            }
                        }
                    }

                    3 -> {
                        // 프로그램 종료에 대한 로직 처리
                        System.exit(0)
                    }

                    else -> {
                        println("잘못된 선택입니다.")
                    }
                }
            }

            2 -> {
                println("시스템을 종료합니다.")
                System.exit(0)
            }

            else -> {
                println("잘못된 선택입니다.")
            }
        }
    }
}