/*
 Navicat Premium Data Transfer

 Source Server         : zgz
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : elm

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 19/08/2022 17:33:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for business
-- ----------------------------
DROP TABLE IF EXISTS `business`;
CREATE TABLE `business`  (
  `Id` int(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '?̼ұ??',
  `Name` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '?̼??',
  `Img` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '?̼?ͼƬ???ļ?·????',
  `TypeId` int(0) UNSIGNED NOT NULL COMMENT '???ͷ??',
  `startPrice` decimal(5, 2) NULL COMMENT '???ͷ',
  `deliveryPrice` decimal(5, 2) NULL COMMENT '???ͷ',
  `Explain` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`Id`) USING BTREE,
  INDEX `TypeId`(`TypeId`) USING BTREE,
  CONSTRAINT `business_ibfk_1` FOREIGN KEY (`TypeId`) REFERENCES `businesstype` (`Id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 10010 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of business
-- ----------------------------
INSERT INTO `business` VALUES (1, '万家饺子', 'img/sj01', 1, 15.00, 3.00, '各种饺子，韭菜鸡蛋，猪肉大葱......');
INSERT INTO `business` VALUES (2, '麦当劳', 'img/sj02', 1, 20.00, 3.00, '汉堡炸鸡，真材实料！！！');
INSERT INTO `business` VALUES (3, '肯德鸡', 'img/sj03', 1, 20.00, 3.00, '炸鸡汉堡，美味无敌！！！');
INSERT INTO `business` VALUES (4, '圣比特', 'img/sj04', 2, 17.00, 4.00, '真香拌饭，香味四溢......');
INSERT INTO `business` VALUES (5, '海底捞', 'img/sj05', 2, 17.00, 3.00, '串串捞');
INSERT INTO `business` VALUES (6, '沸腾鱼乡', 'img/sj06', 3, 19.00, 2.00, '各种鱼片');

-- ----------------------------
-- Table structure for businesstype
-- ----------------------------
DROP TABLE IF EXISTS `businesstype`;
CREATE TABLE `businesstype`  (
  `Id` int(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '???????',
  `Name` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '?????',
  `Img` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '????ͼƬ???ļ?·????',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10010 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of businesstype
-- ----------------------------
INSERT INTO `businesstype` VALUES (1, '美食', 'img/dcfl01');
INSERT INTO `businesstype` VALUES (2, '早餐', 'img/dcfl02');
INSERT INTO `businesstype` VALUES (3, '跑腿代购', 'img/dcfl03');
INSERT INTO `businesstype` VALUES (4, '汉堡披萨', 'img/dcfl04');
INSERT INTO `businesstype` VALUES (5, '甜品饮品', 'img/dcfl05');
INSERT INTO `businesstype` VALUES (6, '素食简餐', 'img/dcfl06');
INSERT INTO `businesstype` VALUES (7, '地方小吃', 'img/dcfl07');
INSERT INTO `businesstype` VALUES (8, '米粉面馆', 'img/dcfl08');
INSERT INTO `businesstype` VALUES (9, '包子粥铺', 'img/dcfl09');
INSERT INTO `businesstype` VALUES (10, '炸鸡炸串', 'img/dcfl10');

-- ----------------------------
-- Table structure for discover
-- ----------------------------
DROP TABLE IF EXISTS `discover`;
CREATE TABLE `discover`  (
  `id` int(0) NOT NULL,
  `img` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of discover
-- ----------------------------
INSERT INTO `discover` VALUES (1, 'img/discoverImg/1', '明天吃什么？还是最爱酸辣味！', '泰式酸辣蛤蜊、 麻油拌豇豆、 八宝蔬菜丁', 'https://mp.weixin.qq.com/s/1Wm_CMa81DLQj3yEwrOr7w');
INSERT INTO `discover` VALUES (2, 'img/discoverImg/2', '鹌鹑蛋腌一下鲜美入味，连汤汁都很可口哦', '腌鹌鹑蛋；蒜泥豆角拌木耳、酸辣绿豆芽', 'https://mp.weixin.qq.com/s/fCRhadGX9V1nzbLOuqulhw');
INSERT INTO `discover` VALUES (3, 'img/discoverImg/3', '手把手教你做酱卤牛肉，怎么吃都香！', '酱卤牛肉', 'https://mp.weixin.qq.com/s/ZP9KktoCVJCFVcTT2P6Y_g');
INSERT INTO `discover` VALUES (4, 'img/discoverImg/4', '加了土豆泥的饺子皮，做的饺子既软又筋道！', '土豆泥饺子皮荠菜肉馅蒸饺； 荠菜杏鲍菇肉馅煎饺', 'https://mp.weixin.qq.com/s/k3-uRD1XA9uEJtpMeF9rHw');

-- ----------------------------
-- Table structure for food
-- ----------------------------
DROP TABLE IF EXISTS `food`;
CREATE TABLE `food`  (
  `Id` int(0) NOT NULL AUTO_INCREMENT COMMENT '食品编号',
  `Name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '食品名称',
  `Explain` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '食品介绍',
  `Img` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '类别图片（文件路径）',
  `Price` decimal(5, 2) NOT NULL COMMENT '食品价格',
  `businessId` int(0) UNSIGNED NOT NULL COMMENT '所属商家编号',
  PRIMARY KEY (`Id`) USING BTREE,
  INDEX `businessId`(`businessId`) USING BTREE,
  CONSTRAINT `food_ibfk_1` FOREIGN KEY (`businessId`) REFERENCES `business` (`Id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of food
-- ----------------------------
INSERT INTO `food` VALUES (1, '纯肉饺子', '新鲜猪肉', 'img/sp01', 15.00, 1);
INSERT INTO `food` VALUES (2, '三鲜饺子', '三鲜', 'img/sp02', 13.00, 1);
INSERT INTO `food` VALUES (3, '韭菜饺子', '韭菜', 'img/sp03', 13.00, 1);
INSERT INTO `food` VALUES (4, '汉堡', '牛肉汉堡', 'img/sp04', 22.00, 2);
INSERT INTO `food` VALUES (5, '薯条', '新鲜薯条', 'img/sp05', 27.00, 2);
INSERT INTO `food` VALUES (6, '香辣鸡翅', '鸡翅', 'img/sp06', 22.00, 3);
INSERT INTO `food` VALUES (7, '麻辣鸡翅', '麻辣', 'img/sp07', 14.00, 3);

-- ----------------------------
-- Table structure for orderform
-- ----------------------------
DROP TABLE IF EXISTS `orderform`;
CREATE TABLE `orderform`  (
  `orderId` int(0) NOT NULL AUTO_INCREMENT COMMENT '所属订单编号',
  `foodId` int(0) NOT NULL COMMENT '食品编号',
  `quantity` int(0) NOT NULL COMMENT '数量',
  `userId` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户',
  PRIMARY KEY (`orderId`) USING BTREE,
  INDEX `foodId`(`foodId`) USING BTREE,
  INDEX `userId`(`userId`) USING BTREE,
  CONSTRAINT `orderform_ibfk_1` FOREIGN KEY (`foodId`) REFERENCES `food` (`Id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `orderform_ibfk_2` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 97 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orderform
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `userId` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户编号',
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `gender` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`userId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('000', '000', '000', 1);
INSERT INTO `user` VALUES ('111', '111', 'zs', 0);
INSERT INTO `user` VALUES ('123', '123', 'zgz', 0);
INSERT INTO `user` VALUES ('222', '222', 'ls', 1);

SET FOREIGN_KEY_CHECKS = 1;
