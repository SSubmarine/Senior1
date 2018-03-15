var list = []
var cart = {}

	window.onLoad(this.check())
	function select (e) {
		console.log(e.getAttribute('data-todo'))
		cart = JSON.parse(e.getAttribute('data-todo'))
		this.list.push(this.cart)
		sessionStorage.setItem('cart', JSON.stringify(this.list))
		this.check()
		}

	function check () {
		var html
		html = "<table>"
		if (sessionStorage.getItem('cart')) {
			list = JSON.parse(sessionStorage.getItem('cart')) 
		
		//document.getElementById("p").innerHTML = JSON.stringify(this.list)
		
		
			html += "<tr><th>Id</th><th>Name</th><th>Price</th></tr>"
		for(var index in this.list) {
				html += "<tr>"
				html += "<td>" + this.list[index].productId + "</td>"
				html += "<td>" + this.list[index].productName + "</td>"
				html += "<td>" + this.list[index].productPrice + "</td>"
				html += "<td><button onClick='deleteSelf(" + index +")'><i class='fa fa-trash' style='font-size:20px;color:red'></i></button></td>"
				html += "</tr>"
			}
		} else {
			html += "<tr>"
				html += "<td>No list in your list orders</td>"
				html += "</tr>"
			}
		html += "</table>"
		document.getElementById("list").innerHTML = html
		document.getElementById("listAddon").innerHTML = html
		
		//document.getElementById("p").innerHTML = JSON.stringify(this.list)
		//document.getElementById("cart").innerHTML = sessionStorage.getItem('cart')
	}

	function deleteSelf(index) {
		console.log("delete " + this.list.splice(index, 1))
		this.list.splice(index, 1)
		sessionStorage.setItem('cart', JSON.stringify(this.list))
		this.check()
		}

	function clearCart () {
		console.log('clear')
		sessionStorage.removeItem('cart')
		this.list = []
		this.check()
		}
