/*
 * Copyright (C) 2019 WipCamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author WipCamp11
 */
public class stock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int item = 0, limit = 10, menu;
        System.out.println("limit= " + (limit));
        System.out.println("item= " + (item));
        System.out.println("1.Add 2.Remove 3.check ");
        menu = sc.nextInt();
        if (menu == 1) {
            if (item < limit) {
                int amount;
                amount = sc.nextInt();
                if (item + amount > limit) {
                    System.out.println("ไอเท็มเต็มลิมิตแล้ว");
                } else {
                    item = item + amount;
                    System.out.println("item= " + item + " amout= " + amount);
                }
            } else {
                System.out.printf("ไอเท็มเต็มแล้ว");
            }
        } else if (menu == 2) {
            if (item > 0) {
                int amount;
                amount = sc.nextInt();
                if (item - amount > 0) {
                    System.out.println("ไอเท็มมีไม่พอให้ลบ");
                } else {
                    //remove item;
                    System.out.printf("item=%d ,limit=%d" ,item, limit);
                }
            } else {
                System.out.println("ไม่มีไอเท็มในโกดัง");
            }
        } else if (menu == 3) {
            System.out.printf("item=%d ,limit=%d", item, limit);
        } else {
            System.out.println("เมนูไม่ถูกต้อง");
        }
    }

}
