package com.example.rcwvw

object Isidaftar {
    private val nama = arrayOf(
        "Pecel Lele",
        "Nasi Goreng",
        "Ayam geprek",
        "Kari Ayam",
        "Tahu Bulat",
        "Salad Buah",
        "Mie Ayam")
    private val detail = arrayOf(
        "Lele yang di laburi sambel pecel",
        "Nasi yang di goreng dengan wajan",
        "Ayam pop yang di geprek dengan sambal",
        "Ayam yang dimasak dengan bumbu kari",
        "Tahu Bulat, di goreng  dimobil, 500 an",
        "Salad yang diisi buah",
        "Mie yang di taburi ayam dengan bumbu sedap gilaaaa")
    private val harga = arrayOf(
        "12000",
        "15000",
        "10000",
        "20000",
        "500",
        "7000",
        "10000"
    )


    val listdata :ArrayList<daftar>
        get() {
            val list = arrayListOf<daftar>()
            for (position in nama.indices){
                val Isidaftar = daftar()
                Isidaftar.nama= nama[position]
                Isidaftar.detail =  detail[position]
                Isidaftar.harga= harga[position]
                list.add(Isidaftar)
            }
            return list
        }
}