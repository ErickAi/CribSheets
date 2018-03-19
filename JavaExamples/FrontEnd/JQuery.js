//Селекторы
//Используйте валидные имена классов и идентификаторов
$("#content")		// выбираем элемент с id=content
$("div#content")	// выбираем div с id=content (хотя и без div работает)
$(".wrapper")		// выбираем элементы с class=wrapper
$("div.wrapper")	// выбираем div'ы с class=wrapper
$(".wrapper.box")	// выбираем элементы с class=wrapper и box
$("h2")				// выбираем все теги h2
$("h1, h2")			// выбираем все теги h1 и h2

//Теперь вспомним, что мы в DOMе не одни, это таки иерархическая структура:
$("article h2") // выбираем все теги h2 внутри тега article
$("div article h2") // выбираем все теги h2 внутри тега article
 // внутри тега div, в доме который построил Джек
$("article").find("h2") // аналогично примерам выше
$("div").find("article").find("h2") // 

//У нас есть соседи:
$("h1 + p") // выбор всех p элементов, перед которыми есть h1
 // элементы (у нас только один такой)
$("#stick ~ article") // выбор всех article элементов после элемента
 // c id=stick
$("#stick").prev() // выбор предыдущего элемента от найденного
$("#stick").next() // выбор следующего элемента от найденного

//Родственные связи:
$("*") // выбор всех элементов
$("article > h2") // выбираем все теги h2 которые являются
 // непосредственными потомками тега article
$("article > *") // выбор всех потомков элементов article
$("article").children()
$("p").parent() // выбор всех прямых предков элементов p
$("p").parents() // выбор всех предков элементов p (не понадобится)
$("p").parents("div") // выбор всех предков элемента p которые есть div
 // parents принимает в качестве параметра селектор
/*
Как я уже говорил ранее, в поиске элементов на странице заключается
практически половина успешной работы с jQuery. Так что приступим к поискам
по документу (чтобы не листать, пусть пример HTML будет и тут):
<!DOCTYPE html>
<html dir="ltr" lang="en-US">
<head>
	<meta charset="UTF-8"/>
	<title>Page Title</title>
</head>
<body>
	<header>
		<h1>Page Title</h1>
		<p>Page Description</p>
	</header>
	<div id="content" class="wrapper box">
	<article>
		<h2>Article Title</h2>
		<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.
		Nunc urna metus, ultricies eu, congue vel, laoreet...</p>
	</article>
	<article>
		<h2>Article Title</h2>
		<p>Morbi malesuada, ante at feugiat tincidunt, enim massa
		gravida metus, commodo lacinia massa diam vel eros...</p>
	</article>
	</div>
	<footer>&copy;copyright 2014</footer>
</body>
</html>
<head>
<meta charset="UTF-8"/>
<title>Page Title</title>
</head>
<body>
<header>
<h1>Page Title</h1>
<p>Page Description</p>
</header>
<div id="content" class="wrapper box">
<article>
<h2>Article Title</h2>
<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.
Nunc urna metus, ultricies eu, congue vel, laoreet...</p>
</article>
<article>
<h2>Article Title</h2>
<p>Morbi malesuada, ante at feugiat tincidunt, enim massa
gravida metus, commodo lacinia massa diam vel eros...</p>
</article>
</div>
<footer>&copy;copyright 2014</footer>
</body>
</html>
А теперь приступим к выборкам — выбор элементов по «id» либо «className»
аналогично используемым в CSS:*/



