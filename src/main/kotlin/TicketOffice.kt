class TicketOffice(private var amount: Long, vararg tickets: Ticket) {

    private val tickets: MutableList<Ticket> = tickets.toMutableList()

    private fun getTicket(): Ticket {
        return tickets.removeAt(0)
    }

    private fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    private fun plusAmount(amount: Long) {
        this.amount += amount
    }

    fun sellTicketTo(audience: Audience) {
        plusAmount(audience.buy(getTicket()))
    }
}