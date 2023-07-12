package Ex2

import java.time.LocalDate

class Pessoa(age: Int, dayB: Int, monthB: Int, yearB: Int, name: String) {
    private var age = age
        get() {return field}
        set(value) {field = value}

    private var dayB = dayB
        get() {return field}
        set(value) {field = value}

    private var monthB = monthB
        get() {return field}
        set(value) {field = value}

    private var yearB = yearB
        get() {return field}
        set(value) {field = value}

    private var name = name
        get() {return field}
        set(value) {field = value}

    fun calcularIdade() {
        val today = LocalDate.now()
        age = today.year - yearB
    }

    fun informarIdade(): Int {
        return age
    }

    fun informarNome(): String {
        return name
    }

    fun ajustarDataDenascimento(day: Int, month: Int, year: Int) {
        this.dayB = day
        this.monthB = month
        this.yearB = year
    }

}