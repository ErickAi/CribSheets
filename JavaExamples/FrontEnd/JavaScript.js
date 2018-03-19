{// ПЕРЕМЕННЫЕ
// — имя может состоять из букв, цифр, и символов «$» и «_»
// — первый символ не должен быть цифрой
// Учтите, регистр букв имеет значение:
var name = "Ivan";
var age = 32;
var company = "Facebook";
var Company = "Google";
// ECMAScript-2015 конструкция «let»:
// — область видимости переменной «let» ограничена блоком {...}, в
let company = "Facebook";
//-----------------------------------------------------------------------------------
}
{// КОНСТАНТЫ ES-2015 
var USER_STATUS_ACTIVE = 1;
var USER_STATUS_BANNED = 2;
const USER_STATUS_ACTIVE = 1;
USER_STATUS_ACTIVE = 2; // error: assignment to constant variable
// если константа объект или массив, содержимое массива изменяемо
const USER_STATUS_ACTIVE = 1;
const USER_STATUS_BANNED = 2;
const USER = {
name: "mr.Smith",
status: USER_STATUS_BANNED
};
USER.status = USER_STATUS_ACTIVE; // ok
USER = {name: "mr.Wesson"}; // error
//-----------------------------------------------------------------------------------
}
{// ТИПЫ ДАННЫХ
// — number — целое или дробное число:
var answer = 42;
var pi = 3.1415;
NaN (not-a-number) — р
// — string — строка, заключается в кавычки:
// в JavaScript нет разницы между двойными кавычками и одинарными (привет PHP)
var str = "Hello World!";
// — boolean — булево значение, т.е. или «true» или «false»
var result = true;
// — object — это объекты, на них остановлюсь подробнее чуть позже…
// — symbol — тип данных из ES-2015, служит для создания уникальных
идентификаторов (о нём рассказа не будет, не в ходу ещё)
— null — специальное значение для определения «пустоты»
var result = null;
// — undefined — ещё одно специальное значение, для «неопределенности»
// переменная есть, но нет значения
var a;
alert(a); // undefined
if (typeof a == "undefined") {
alert("variable is undefined");
}
// или может совсем не быть переменной
if (window["a"] == undefined) {
alert("variable does not exist");
}
//-----------------------------------------------------------------------------------
}
{// ФУНКЦИИ
// Блоки if/else, switch, for, while, do..while не влияют на область видимости переменных.
// Неважно, где именно в функции и сколько раз объявляется переменная. Любое объявление срабатывает один раз и распространяется на всю функцию.
// Переменные, объявленные на уровне всего скрипта, называют «глобальными переменными».
// Внимание: неявное объявление глобальных переменных!
// Параметры копируются в локальные переменные функции.
// Аргументы по умолчанию как правило, располагают в конце списка.
// Передаваемые значения копируются в параметры функции и становятся локальными переменными.
// Параметры функции копируются в её локальные переменные.
// Можно объявить новые локальные переменные при помощи var.
// Значение возвращается оператором return ....
// Вызов return тут же прекращает функцию.
// Если return; вызван без значения, или функция завершилась без return, то её результат равен undefined.
// При обращении к необъявленной переменной функция будет искать внешнюю переменную с таким именем, но лучше, если функция использует только локальные переменные:
// Функции в JavaScript являются значениями. Их можно присваивать, передавать, создавать в любом месте кода.

// Function Declaration - функция объявлена в основном потоке кода.
	// парсится вне очереди загрузки скрипта, доступна до объявления, в if не работает.
// Function Expression - функция создана как часть выражения.
	// создается в основном потокне выполнения, доступна после объявления, условное объявление в if работает.
function hello() {
alert("Hello world");
}
// Анонимные функции
function() {
alert("Hello world");
}
// функцию можно присвоить переменной, и
// (или) передать в качестве параметра в другую функцию:
var myAlert = function(name) {
alert("Hello " + name);
}
function helloMike(myFunc) { // тут функция передаётся как параметр
myFunc("Mike"); // а тут мы её вызываем
}
helloMike(myAlert);
// Анонимную функцию можно создать и тут же вызвать с необходимыми параметрами:
(function(name) {
alert("Hello " + name);
})("Mike");
// ES-2015 сокращенную запись для анонимных функций — функции-стрелки:
// была простая анонимная функция
var inc = function (x) {
return x+1;
}
// стала запись в одну строчку
var inc = x => x+1;
// была функция с несколькими аргументами
var sum = function (a, b) {
return a+b;
}
// стала запись в одну строчку
var sum = (a, b) => a+b;
//-----------------------------------------------------------------------------------
}
{// ОБЛАСТИ ВИДИМОСТИ И ЗАМЫКАНИЯ
Изучив замыкания, можно понять много магии в JavaScript’e. Приведу пример
кода с пояснениями:
var a = 1234;
var myFunc = function(){
var b = 4321;
var c = 1111;
return function() {
return ((a+b)/c);
};
};
var anotherFunc = myFunc(); // myFunc возвращает анонимную функцию
// с «замкнутыми» значениями c и b
alert(anotherFunc()); // => 5
/*Что же тут происходит: функция, объявленная внутри другой функции, имеет
доступ к переменным родительской функции. Повтыкайте в код, пока вас не
осенит, о чём я тут толкую.*/
//-----------------------------------------------------------------------------------
}
{// МАССИВЫ
//Массив являются объектом. индекс(параметр): значение //Смотри ОБЪЕКТЫ
var users = ["Ivan", "Petr", "Serg"]
alert(users[0]); // выведет Ivan
// Размер массива хранится в свойстве length:
// В действительности «length» возвращает индекс последнего
// элемента массива+1, так что не попадитесь:
alert(users.length); // выведет 3
a[3] = "Danylo";
alert(users.length); // выведет 4

var a = [];
a[4] = 10;
alert(a.length); // выведет 5;
// Для перебора массива лучше всего использовать цикл «for(;;)»:
for (let i = 0; i < users.length; i++) {
alert(users[i]); // последовательно выведет Ivan, Petr и Serg
}
// «push()» и «pop()»:
users.push("Sidorov"); // добавляем элемент в конец массива
var sidorov = users.pop(); // удаляем и возращаем последний элемент
// «unshift()» и «shift()»:работают медленно, т.к. перестраивают весь массив
users.unshift("Sidorov"); // добавляем элемент в начало массива
var sidorov = users.shift(); // удаляем и возращаем первый элемент
//-----------------------------------------------------------------------------------
}
{// ОБЪЕКТЫ
/* На объекты в JavaScript возложено две роли:
— хранилище данных
— функционал объекта
 Первое предназначение можно описать следующим кодом */
var user = {
name: "Ivan",
age: 32
};
alert(user.name); // Ivan
alert(user.age); // 32
// key-value хранилище, хэш ассоциативный массив, мапа или
// JSON – JavaScript Object Notation (хоть и с небольшими оговорками).
// Для перебора такого хранилища можно использовать цикл «for(.. in ..)»:
for (let prop in user) {
alert(prop + "=" + user[prop]); // выведет name=Ivan
 // затем age=32
}
// любая функция вызванная с использованием ключевого слова «new» возвращает нам объект, 
// а сама становится конструктором данного объекта:
function User(name) {
this.name = name;
this.status = USER_STATUS_ACTIVE;
}
var me = new User("Anton");
/*Поведение функции «User()» при использовании «new» слегка изменится:
1. Данная конструкция создаст новый, пустой объект
2. Ключевое слово «this» получит ссылку на этот объект
3. Функция выполнится и возможно изменит объект через «this» (как в
примере выше)
4. Функция вернёт «this» (по умолчанию)
Результатом выполнения кода будет следующий объект:
{name: "Anton", status: 1 }
Опять отправлю читать про ES-2015, в данном стандарте появилась
конструкция «class», что по сути — синтаксический сахар для
JavaScript’а — специально для тех, кто любит C-подобные языки
программирования — https://learn.javascript.ru/es-class.*/

/*Область видимости и чудо this
Для тех, кто только начинает своё знакомство с JavaScript я расскажу следующие
нюансы:
— когда вы объявляете переменную или функцию,то она становится частью
«window»:*/
var a = 1234;
alert(window["a"]); // => 1234
function myLog(message) {
alert(message); // => 1234
}
window["myLog"](a);
/*— когда искомая переменная не найдена в текущей области видимости, то
её поиски будут продолжены в области видимости родительской
функции:*/
var a = 1234;
(function(){
var b = 4321;
(function() {
var c = 1111;
alert((a+b)/c); // => 5
})();
})();
/*— чудо-переменная «this» всегда указывает на текущий объект
вызывающий функцию (поскольку по умолчанию все переменные и
функции попадают в «window», то «this == window»):*/
var a = 1234;
function myLog() {
alert(this); // => window
alert(this.a); // => 1234
}
/*— контекст «this» можно изменить используя функции «bind()», «call()»,
и «apply()»
Всё что касается «window» относится лишь к браузерам, но поскольку
книга о jQuery, то иное поведение я и не рассматриваю, но вот так
прозрачно намекаю, что оно есть ;)*/
//-----------------------------------------------------------------------------------
}
{// ОБЪЕКТЫ

//-----------------------------------------------------------------------------------
}
{// DOM

//-----------------------------------------------------------------------------------
}
{// СОБЫТИЯ
// Событие - это сигнал от браузера об активности пользователя/бота.
	// мыши, клавиатурные, на элементах управления, документа, CSS
// Назначение обработчиков событий
	// атрибут HTML инлайн или запуск функции
	<script>
		function myAlert() {alert("Клик!")}
	</script>
	<input type="button" value="Нажми меня" onclick="alert('Клик!')" >
	<input type="button" value="Нажми меня" onclick="myAlert()" >
	// Использование свойства DOM-объекта
	<input id="elem" type="button" value="Нажми меня" />
		<script>
			elem.onclick = function() {
			alert( 'Спасибо' );
			};
		</script>
	// addEventListener и removeEventListener
	// element.addEventListener(event, handler[, phase]);
	<input id="elem" type="button" value="Нажми меня"/>
		<script>
			function handler1() {
			alert('Спасибо!');
			};
			function handler2() {
			alert('Спасибо ещё раз!');
			}
			elem.onclick = function() { alert("Привет"); };
			elem.addEventListener("click", handler1); // Спасибо!
			elem.addEventListener("click", handler2); // Спасибо ещё раз!
		</script>
	
	
	
	var element = document.getElementById('element');
		function callback() {
			alert('Привет');
		}
	element.addEventListener('click', callback);
// События
	// основы, порядок, объект события, всплытие и перехват, делегирование, паттерн "поведение", дейсвия браузера по умолчанию, генерация событий на элементах
// События углубленно
	// клики, кнопка, координаты; отмена выделения, невыделяемые элементы; движение курсора; Drag'n'Drop; колесо; скролл; keyup, keydown, keypress; загрузка документа; загрузка скриптов, картинок, фреймов.

//-----------------------------------------------------------------------------------
}
{// ФОРМЫ, элементы управления
	// Навигация и свойства элементов формы; фокусировка; изменение; отправка, метод submit

//-----------------------------------------------------------------------------------
}
