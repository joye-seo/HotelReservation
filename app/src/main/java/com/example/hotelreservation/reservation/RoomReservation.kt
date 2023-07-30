package com.example.hotelreservation.reservation

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

val localTime = LocalDateTime.now()
val formatter = DateTimeFormatter.ofPattern("a HH시 mm분")
val chargeTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초")
val time = localTime.format(formatter)
class RoomReservation : ReservationList() {
    var boolean = true
    fun reservation() {
        println("예약자분의 성함을 입력해주세요")
        val name = readLine().toString()

        println("예약할 방번호를 입력해주세요")

        try {
            val roomNumber = readLine()?.toInt()

            if (roomNumber in 100..999) {
                println("룸배정되었습니다")
            } else {
                println("옳바르지 않은 방번호 입니다. 방번호는 100~999 영역 이내입니다. ")
                boolean = false
            }

        } catch (e: java.lang.NumberFormatException) {
            println("방번호는 숫자만 입력할 수 있습니다")
            boolean = false

        }

        println("체크인 날짜를 입력해주세요 표기형식. 20230723")

        val ckeckIn = readLine()?.toInt()
        if (ckeckIn != null) {
            if (ckeckIn > 20230723) {

            } else {
                println("체크인은 지난날은 선택할 수 없습니다")
                boolean = false

            }

        } else {
            println("체크인 날짜를 입력하세요")
            boolean = false

        }

        println("체크아웃 날짜를 입력해주세요 표기형식. 20230723")
        val checkOut = readLine()?.toInt()

        if (checkOut != null) {
            if (checkOut > ckeckIn!!) {

            } else {
                println("체크인은 지난날은 선택할 수 없습니다")
                boolean = false

            }

        } else {
            println("체크아웃 날짜를 입력하세요")
            boolean = false

        }

        if (boolean){
            println("호텔예약이 완료되었습니다.")
        } else{
            println("호텔예약을 처음부터 다시 해주세요.")
        }

    }
}