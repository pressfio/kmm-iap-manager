package io.pressf.kmm_iap_manager.IAPStore

import io.pressf.kmm_iap_manager.IAPProduct.IAPProduct
import io.pressf.kmm_iap_manager.IAPProduct.IAPProductMetadata
import kotlinx.coroutines.channels.Channel

internal actual object IAPStore {

    internal actual fun requestProducts(ids: Set<String>) { }

    internal actual fun restorePurchases() { }

    internal actual fun purchaseProduct(product: IAPProduct) { }

    internal actual fun start() { }

    internal actual fun updatePurchaseHistory() { }

    internal actual val productsChannel: Channel<Result<List<IAPProduct>>>
        get() = TODO("Not yet implemented")
    internal actual val productMetadataChannel: Channel<Result<IAPProductMetadata>>
        get() = TODO("Not yet implemented")
    internal actual val purchaseHistory: String?
        get() = TODO("Not yet implemented")

}