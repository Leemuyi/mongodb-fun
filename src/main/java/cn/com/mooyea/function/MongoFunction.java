package cn.com.mooyea.function;

import java.io.Serializable;
import java.util.function.Function;

/**
 * <h1>MongoFunction<h1>
 * <p>Copyright (C), 星期五,30,9月,2022</p>
 * <br/>
 * <hr>
 * <h3>File Info:</h3>
 * <p>FileName: MongoFunction</p>
 * <p>Author:   mooye</p>
 * <p>Work_Email： lidy@skyvis.com.cn</p>
 * <p>E-mail： curtainldy@163.com</p>
 * <p>Date:     2022/9/30</p>
 * <p>Description: MongoDB 函数式抽象接口</p>
 * <hr>
 * <h3>History:</h3>
 * <hr>
 * <table>
 *  <thead>
 *  <tr><td style='width:100px;' center>Author</td><td style='width:200px;' center>Time</td><td style='width:100px;' center>Version_Number</td><td style='width:100px;' center>Description</td></tr>
 *  </thead>
 *  <tbody>
 *    <tr><td style='width:100px;' center>mooye</td><td style='width:200px;' center>16:23 2022/9/30</td><td style='width:100px;' center>v_1.0.0</td><td style='width:100px;' center>创建</td></tr>
 *  </tbody>
 * </table>
 * <hr>
 * <br/>
 *
 * @author mooye
 */

@FunctionalInterface
public interface MongoFunction<T, R> extends Function<T, R>, Serializable {
}
