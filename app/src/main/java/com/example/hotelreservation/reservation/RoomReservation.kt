package com.example.hotelreservation.reservation

class RoomReservation:ReservationList() {
    fun reservation(){
        println("예약자분의 성함을 입력해주세요")
        val name = readLine().toString() // 아직 null처리 안해줌

        println("예약할 방번호를 입력해주세요")
        val roomNumber = readLine()?.toInt() // 아직 null처리 안해줌

        println("체크인 날짜를 입력해주세요 표기형식. 20230723")
        val ckeckIn = readLine()?.toInt() // 아직 null처리 안해줌

        println("체크아웃 날짜를 입력해주세요 펴기형식. 20230723")
        val checkOut = readLine()?.toInt() // 아직 null처리 안해줌

        println("호텔예약이 완료되었습니다.")

    }
}