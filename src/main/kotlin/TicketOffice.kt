class TicketOffice(private var amount: Long, vararg tickets: Ticket) {

    private val tickets: MutableList<Ticket> = tickets.toMutableList()

    fun getTicket(): Ticket {
        return tickets.removeAt(0)
    }

    fun minusAmount(amount: Long): Unit {
        this.amount -= amount
    }

    fun plusAmount(amount: Long): Unit {
        this.amount += amount
    }
}