package top.haoming9245.lsplugin

sealed interface ApksignExtension {
    var storeFileProperty: String?
    var storePasswordProperty: String?
    var keyAliasProperty: String?
    var keyPasswordProperty: String?
}
