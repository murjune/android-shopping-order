package woowacourse.shopping.domain.entity.coupon

import woowacourse.shopping.domain.entity.Cart
import java.time.LocalDateTime

data class FixedCoupon(
    override val id: Long,
    override val code: String,
    override val description: String,
    override val expirationDate: LocalDateTime,
    override val targetDateTime: LocalDateTime,
    val discount: Long,
    val discountableMinPrice: Long,
) : Coupon(id, code, description, expirationDate, targetDateTime) {
    override fun available(cart: Cart, shippingFee: Long): Boolean {
        return !isExpired && cart.totalPrice() >= discountableMinPrice
    }

    override fun calculateDiscount(cart: Cart, shippingFee: Long): DiscountResult {
        val totalPrice = cart.totalPrice()
        return DiscountResult(totalPrice, discount, shippingFee)
    }
}