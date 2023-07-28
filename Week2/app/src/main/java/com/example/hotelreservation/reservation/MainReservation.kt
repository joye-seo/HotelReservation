package com.example.hotelreservation.reservation
//level1

fun main() {
    println("호텔예약 프로그램입니다. \n[메뉴]\n1. 방예약 2. 예약목록 출력 3. 예약목록 (정렬) 출력 4. 시스템 종료 5. 금액 입금-출금 내역 목록 출력 6. 예약 변경/취소 ")
    MainReservation().reservation()

}

class MainReservation {
    val number = readLine()!!.toInt()
    fun reservation() {
        when (number) {
            1 -> {
                println("방예약")
                RoomReservation().reservation()
            }

            2 -> {
                println("예약목록")

            }

            3 -> println("예약목록정렬출력")
            4 -> {
                println("시스템종료")
            }

            5 -> println("금액 입금 출금 내역")
            6 -> println("예약 변경 및 취소")
        }
    }
}