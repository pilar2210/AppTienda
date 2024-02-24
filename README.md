Crear una aplicación que simule el funcionamiento de una tienda de productos. Tendrá
los siguientes elementos:
- MainActivity: Pantalla que tendrá:
o un menú superior con un item Ver carrito. La pulsación de dicho item
llevará a la pantalla SecondActivity
o un spinner que mostrará todas las categorías de los productos. Para ello
tendrás que utilizar la librería volley con el siguiente json:
https://dummyjson.com/products/categories
o un recycler view que mostrará todos los productos que aparezcan en el
siguiente json: https://dummyjson.com/products . Para la carga tendrás
que utilizar la librería volley. Cada fila del recycler view mostrará la
imagen (cargada con glide), el nombre, precio del producto y un botón
de añadir al carrito. La pulsación de este botón añadirá el producto al
carrito de compra.
- SecondActivity: pantalla que tendrá
o Un recycler view con todos los productos que estén dentro del carrito.
o Un TextView donde aparezca el precio total de todos los productos
o Un menú con:
§ un item Confirmar compra: al pulsarlo aparecerá un Snackbar
donde aparezca el texto: Enhorabuena, compra por valor de XX
realizada
3
§ un item Vaciar carrito: al pulsarlo aparecerá un Snackbar donde
aparezca el texto carrito vaciado y desaparecerán todos los
elementos de la lista
