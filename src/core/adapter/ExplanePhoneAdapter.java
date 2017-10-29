package core.adapter;
/*Эта абстракция, такая Абстракция... даже на вопрос:
        "— А можно более конкретный пример?"
        ответом:
        "— Ок. Допустим, что у каждого фреймворка есть свой уникальный интерфейс «список», вот как это может выглядеть:"
        Бла-бла-класс-объект-бла-фреймворк-интерфейс-бла-бла-конструктор-бла-пример_использования
        "— Больше всего понравился пример использования. Очень компактно и понятно."
        Seriously??? ДаНуНа!

        конкретный пример это:      //взято из не_вашего ролика на youtube из комментов ниже
        //(пора бы и свои заливать, качество курса в разы повысится)
*/
//у меня есть телефон и у него села батарея.
class Phone {
    //с методами:
    void connectPhone() {
        System.out.println("Телефон подключен");
    }
    void chargePhone() {
        System.out.println("Заряжаем до 99%");
    }
    void disconnectPhone() {
        System.out.println("Питание отключено");
    }
}

//есть розетка, к которой можно подключить множество бытовых приборов. в т.ч и телефон
interface  Socket {
    //у него, среди прочих есть методы:
    void connect();
    void charge();
    void disconnect();
}

/*теоретически, я знаю что зарядить его можно подключившись к розетке.
* но нельзя так просто взять, и воткнуть два провода в розетку а другие их концы сунуть в телефон.
* оставим за кадром напряжение/силу тока/переменность... банально не подходят разъемы
* для подключения телефонов к розетке мы и создаем адаптер.
* имплементирующий абстрактные методы розетки
* приделываем к этому адаптеру штекер под конкретный телефон.
*                (эту задачу выполняет конструктор)
* и в @Override методы имплементированного интерфейса Socket
* передаем конкретные методы класса Phone
*/
class PhoneAdapter implements Socket {
    private Phone microUSBphone = null;
    public PhoneAdapter(Phone phone){
        this.microUSBphone = phone;
    }
    @Override
    public void connect() {
        microUSBphone.connectPhone();
    }
    @Override
    public void charge() {
        microUSBphone.chargePhone();
    }
    @Override
    public void disconnect() {
        microUSBphone.disconnectPhone();
    }
}

//теперь, мы можем зарядить телефон
public class ExplanePhoneAdapter {

    public static void main(String[] args) {
        //берем телефон
        Phone superMegaWanderfulPhone = new Phone();
        //подключаем к розетке
        Socket thisSocket = new PhoneAdapter(superMegaWanderfulPhone);
        //Socket thisSocket = new PhoneAdapter(new Phone());
        thisSocket.connect();
        thisSocket.charge();
        thisSocket.disconnect();
    }
}
