package com.dzx.seckill.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author dengzhenxiang
 * @Date 2018/10/30 15:49
 * @Version
 * user
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
	private Integer id;
	private String name;

}
