/*
interface	SortedMap		Отсортированный словарь
interface	NavigbleMap		implements SortedMap
class		HashMap			
class		TreeMap			implements NavigbleMap
Hashtable	Хеш-таблица		Потокобезопасный HashMap

return	method		(method)	for		Class map

int		size()				Возвращает размер
bool	containsKey(key)	Проверить наличие «ключа»	
bool	containsValue(value)Проверить наличие «значения»
bool	equals(map)			сравнивает Map	
bool	isEmpty()			Проверить что Map — пустой	
void	clear()				Очистить Map	
void	putAll(Map<K,V>)	Копировать Map
V		put(key, value)		Добавить пару
	//после добавления возвращает старое значение V по K или null
V		remove(key)			Удалить элемент по ключу	
V		get(key)			Получить значение по ключу	
Set<K>				keySet()			Получить множество всех ключей	
Collection<V>		values()			Получить множество всех значений
Set<Map.Entry<K,V>	entrySet()			Получить множество всех пар	
*/
public static void map(String[] args){
    //все элементы хранятся в парах
    Map<String, String> map = new HashMap<String, String>();
    map.put("first", "Mama");
    map.put("second", "Mila");
    map.put("third", "Ramu");

for (Map.Entry entry : properties.entrySet()){
    System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
}
//что внутри метода for each (итератора)  
Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
    while (iterator.hasNext()){
        //получение «пары» элементов
        Map.Entry<String, String> pair = iterator.next();
        String key = pair.getKey();            //ключ
        String value = pair.getValue();        //значение
        System.out.println(key + ":" + value);
    }
//инкрементировать value при совпадении key
Map <Character, Integer> map = new Map<>;
for (char i = 'a'; i<'d'; i++){
    Integer frequency = hashMap.get(i);
    hashMap.put(number, frequency == null ? 1 : frequency + 1);
}
//инкрементировать value c Java8
public void incrementValue(Character key) {
         map.put(key, map.getOrDeafult(key,0) + 1);
    }
}

System.out.println(hashMap);
//подсчет совпадений заданной строки со значениями карты	
	public static int getCountTheSameValue(HashMap<String, String> map, String name)
    {
        int n = 0;
        for (HashMap.Entry<String, String> pair : map.entrySet()){
            String value = pair.getValue();
            if (name.equals(value)) n++;
        }
        return n;
}