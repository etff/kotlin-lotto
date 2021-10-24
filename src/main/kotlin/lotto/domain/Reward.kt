package lotto.domain

enum class Reward(
    val matchCount: Int,
    val amount: Int
) {
    FIRST(6, 2000_000_000),
    SECOND(5, 1_500_000),
    THIRD(4, 50_000),
    FOURTH(3, 5_000),
    NONE(0, 0);

    companion object {
        fun of(matchCount: Int): Reward {
            return values().firstOrNull { it.matchCount == matchCount } ?: NONE
        }
    }
}