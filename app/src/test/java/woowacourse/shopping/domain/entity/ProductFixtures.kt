package woowacourse.shopping.domain.entity

fun fakeProduct(
    id: Long = 1,
    price: Int = 1000,
    name: String = "콜라",
    imageUrl: String = "https://image.com",
): Product {
    return Product(
        id = id,
        price = price,
        name = name,
        imageUrl = imageUrl,
    )
}