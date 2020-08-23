package com.alibaba.design;

/**.
 * <span>双检锁/双重校验锁</span>
 * <table>
 *     <tr>
 *         特点:
 *     </tr>
 *     <tr>
 *         1、延迟加载
 *     </tr>
 *     <tr>
 *         2、多线程安全
 *     </tr>
 *     <tr>
 *         3、实现较为复杂
 *     </tr>
 *     <tr>
 *         采用双锁机制，安全且在多线程情况下能保持高性能,getInstance()的性能
 *         对应用程序很关键
 *     </tr>
 * </table>
 */
public class DoubleCheckedLocking {

    /**.
     * 主函数
     * @param args 主函数参数
     */
    public static void main(String [] args){
        // 获取一个新的实例
        Animal animal1 = Animal.getInstance();
        // 获取第二个实例
        Animal animal2 = Animal.getInstance();
        // 判断二者是否相同
        System.out.println(animal1 == animal2);
    }
}

/**.
 * 单例设计模式-双检锁
 */
class Animal {

    // 创建一个只保存在内存中的对象
    private volatile static Animal animal;

    /**.
     * 设置一个私有的无参构造
     */
    private Animal() {}

    /**.
     * 返回一个实例
     * @return 唯一的实例
     */
    public static Animal getInstance() {
        // 判断对象是否为空
        if ( animal == null){
            // 对象为空设置线程安全
            synchronized(Animal.class) {
                // 判断是否为空
                if (animal == null){
                    // 为空就创建新的对象
                    animal = new Animal();
                }
            }
        }
        return animal;
    }
}