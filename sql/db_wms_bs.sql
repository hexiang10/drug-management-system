/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : db_wms_bs

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 13/05/2021 09:22:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for wms_access_record
-- ----------------------------
DROP TABLE IF EXISTS `wms_access_record`;
CREATE TABLE `wms_access_record`  (
  `RECORD_ID` int NOT NULL AUTO_INCREMENT,
  `USER_ID` int NOT NULL,
  `USER_NAME` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ACCESS_TYPE` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ACCESS_TIME` datetime(0) NOT NULL,
  `ACCESS_IP` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`RECORD_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wms_access_record
-- ----------------------------
INSERT INTO `wms_access_record` VALUES (1, 1001, 'admin', 'login', '2021-04-18 17:14:46', '0:0:0:0:0:0:0:1');
INSERT INTO `wms_access_record` VALUES (2, 1001, 'admin', 'login', '2021-04-18 17:20:12', '0:0:0:0:0:0:0:1');
INSERT INTO `wms_access_record` VALUES (3, 1001, 'admin', 'login', '2021-04-18 17:33:23', '0:0:0:0:0:0:0:1');
INSERT INTO `wms_access_record` VALUES (4, 1001, 'admin', 'login', '2021-04-19 03:48:06', '0:0:0:0:0:0:0:1');
INSERT INTO `wms_access_record` VALUES (5, 1001, 'admin', 'login', '2021-04-20 16:55:23', '0:0:0:0:0:0:0:1');
INSERT INTO `wms_access_record` VALUES (6, 1001, 'admin', 'login', '2021-04-21 15:21:40', '0:0:0:0:0:0:0:1');
INSERT INTO `wms_access_record` VALUES (7, 1001, 'admin', 'login', '2021-05-10 03:56:26', '0:0:0:0:0:0:0:1');
INSERT INTO `wms_access_record` VALUES (8, 1020, '何灿烊', 'login', '2021-05-10 04:15:46', '0:0:0:0:0:0:0:1');
INSERT INTO `wms_access_record` VALUES (9, 1020, '何灿烊', 'logout', '2021-05-10 04:17:22', '0:0:0:0:0:0:0:1');
INSERT INTO `wms_access_record` VALUES (10, 1018, '何小红', 'login', '2021-05-10 04:18:14', '0:0:0:0:0:0:0:1');
INSERT INTO `wms_access_record` VALUES (11, 1018, '何小红', 'logout', '2021-05-10 04:18:46', '0:0:0:0:0:0:0:1');
INSERT INTO `wms_access_record` VALUES (12, 1019, '何小翔', 'login', '2021-05-10 04:18:58', '0:0:0:0:0:0:0:1');
INSERT INTO `wms_access_record` VALUES (13, 1019, '何小翔', 'logout', '2021-05-10 04:19:27', '0:0:0:0:0:0:0:1');
INSERT INTO `wms_access_record` VALUES (14, 1001, 'admin', 'login', '2021-05-12 02:03:59', '0:0:0:0:0:0:0:1');
INSERT INTO `wms_access_record` VALUES (15, 1001, 'admin', 'login', '2021-05-12 06:24:13', '0:0:0:0:0:0:0:1');
INSERT INTO `wms_access_record` VALUES (16, 1001, 'admin', 'login', '2021-05-12 06:30:16', '0:0:0:0:0:0:0:1');

-- ----------------------------
-- Table structure for wms_action
-- ----------------------------
DROP TABLE IF EXISTS `wms_action`;
CREATE TABLE `wms_action`  (
  `ACTION_ID` int NOT NULL AUTO_INCREMENT,
  `ACTION_NAME` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ACTION_DESC` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ACTION_PARAM` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`ACTION_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 49 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wms_action
-- ----------------------------
INSERT INTO `wms_action` VALUES (1, 'addSupplier', NULL, '/supplierManage/addSupplier');
INSERT INTO `wms_action` VALUES (2, 'deleteSupplier', NULL, '/supplierManage/deleteSupplier');
INSERT INTO `wms_action` VALUES (3, 'updateSupplier', NULL, '/supplierManage/updateSupplier');
INSERT INTO `wms_action` VALUES (4, 'selectSupplier', NULL, '/supplierManage/getSupplierList');
INSERT INTO `wms_action` VALUES (5, 'getSupplierInfo', NULL, '/supplierManage/getSupplierInfo');
INSERT INTO `wms_action` VALUES (6, 'importSupplier', NULL, '/supplierManage/importSupplier');
INSERT INTO `wms_action` VALUES (7, 'exportSupplier', NULL, '/supplierManage/exportSupplier');
INSERT INTO `wms_action` VALUES (8, 'selectCustomer', NULL, '/customerManage/getCustomerList');
INSERT INTO `wms_action` VALUES (9, 'addCustomer', NULL, '/customerManage/addCustomer');
INSERT INTO `wms_action` VALUES (10, 'getCustomerInfo', NULL, '/customerManage/getCustomerInfo');
INSERT INTO `wms_action` VALUES (11, 'updateCustomer', NULL, '/customerManage/updateCustomer');
INSERT INTO `wms_action` VALUES (12, 'deleteCustomer', NULL, '/customerManage/deleteCustomer');
INSERT INTO `wms_action` VALUES (13, 'importCustomer', NULL, '/customerManage/importCustomer');
INSERT INTO `wms_action` VALUES (14, 'exportCustomer', NULL, '/customerManage/exportCustomer');
INSERT INTO `wms_action` VALUES (15, 'selectGoods', NULL, '/goodsManage/getGoodsList');
INSERT INTO `wms_action` VALUES (16, 'addGoods', NULL, '/goodsManage/addGoods');
INSERT INTO `wms_action` VALUES (17, 'getGoodsInfo', NULL, '/goodsManage/getGoodsInfo');
INSERT INTO `wms_action` VALUES (18, 'updateGoods', NULL, '/goodsManage/updateGoods');
INSERT INTO `wms_action` VALUES (19, 'deleteGoods', NULL, '/goodsManage/deleteGoods');
INSERT INTO `wms_action` VALUES (20, 'importGoods', NULL, '/goodsManage/importGoods');
INSERT INTO `wms_action` VALUES (21, 'exportGoods', NULL, '/goodsManage/exportGoods');
INSERT INTO `wms_action` VALUES (22, 'selectRepository', NULL, '/repositoryManage/getRepositoryList');
INSERT INTO `wms_action` VALUES (23, 'addRepository', NULL, '/repositoryManage/addRepository');
INSERT INTO `wms_action` VALUES (24, 'getRepositoryInfo', NULL, '/repositoryManage/getRepository');
INSERT INTO `wms_action` VALUES (25, 'updateRepository', NULL, '/repositoryManage/updateRepository');
INSERT INTO `wms_action` VALUES (26, 'deleteRepository', NULL, '/repositoryManage/deleteRepository');
INSERT INTO `wms_action` VALUES (27, 'importRepository', NULL, '/repositoryManage/importRepository');
INSERT INTO `wms_action` VALUES (28, 'exportRepository', NULL, '/repositoryManage/exportRepository');
INSERT INTO `wms_action` VALUES (29, 'selectRepositoryAdmin', NULL, '/repositoryAdminManage/getRepositoryAdminList');
INSERT INTO `wms_action` VALUES (30, 'addRepositoryAdmin', NULL, '/repositoryAdminManage/addRepositoryAdmin');
INSERT INTO `wms_action` VALUES (31, 'getRepositoryAdminInfo', NULL, '/repositoryAdminManage/getRepositoryAdminInfo');
INSERT INTO `wms_action` VALUES (32, 'updateRepositoryAdmin', NULL, '/repositoryAdminManage/updateRepositoryAdmin');
INSERT INTO `wms_action` VALUES (33, 'deleteRepositoryAdmin', NULL, '/repositoryAdminManage/deleteRepositoryAdmin');
INSERT INTO `wms_action` VALUES (34, 'importRepositoryAd,om', NULL, '/repositoryAdminManage/importRepositoryAdmin');
INSERT INTO `wms_action` VALUES (35, 'exportRepository', NULL, '/repositoryAdminManage/exportRepositoryAdmin');
INSERT INTO `wms_action` VALUES (36, 'getUnassignRepository', NULL, '/repositoryManage/getUnassignRepository');
INSERT INTO `wms_action` VALUES (37, 'getStorageListWithRepository', NULL, '/storageManage/getStorageListWithRepository');
INSERT INTO `wms_action` VALUES (38, 'getStorageList', NULL, '/storageManage/getStorageList');
INSERT INTO `wms_action` VALUES (39, 'addStorageRecord', NULL, '/storageManage/addStorageRecord');
INSERT INTO `wms_action` VALUES (40, 'updateStorageRecord', NULL, '/storageManage/updateStorageRecord');
INSERT INTO `wms_action` VALUES (41, 'deleteStorageRecord', NULL, '/storageManage/deleteStorageRecord');
INSERT INTO `wms_action` VALUES (42, 'importStorageRecord', NULL, '/storageManage/importStorageRecord');
INSERT INTO `wms_action` VALUES (43, 'exportStorageRecord', NULL, '/storageManage/exportStorageRecord');
INSERT INTO `wms_action` VALUES (44, ' stockIn', '货物进库操作', '/stockRecordManage/stockIn');
INSERT INTO `wms_action` VALUES (45, 'stockOut', '货物出库操作', '/stockRecordManage/stockOut');
INSERT INTO `wms_action` VALUES (46, 'searchStockRecord', '查询货物出入库记录', '/stockRecordManage/searchStockRecord');
INSERT INTO `wms_action` VALUES (47, 'getAccessRecords', '查询登入登出记录', '/systemLog/getAccessRecords');
INSERT INTO `wms_action` VALUES (48, 'selectUserOperationRecords', '查村用户操作记录', '/systemLog/selectUserOperationRecords');

-- ----------------------------
-- Table structure for wms_customer
-- ----------------------------
DROP TABLE IF EXISTS `wms_customer`;
CREATE TABLE `wms_customer`  (
  `CUSTOMER_ID` int NOT NULL AUTO_INCREMENT,
  `CUSTOMER_NAME` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `CUSTOMER_PERSON` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `CUSTOMER_TEL` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `CUSTOMER_EMAIL` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `CUSTOMER_ADDRESS` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`CUSTOMER_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1217 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wms_customer
-- ----------------------------
INSERT INTO `wms_customer` VALUES (1214, '甲园软件有限公司', '小明', '17716786888', '23369888@136.com', '中国 广东省 珠海市 香洲区 香洲区大道1号');
INSERT INTO `wms_customer` VALUES (1215, '格小力电子有限公司', '小刚', '85263335-820', '85264958@126.com', '中国 广东省 珠海市 斗门区 斗门区大道2号');
INSERT INTO `wms_customer` VALUES (1216, '笑哈哈饮品有限公司 ', '小李', '87094196', '87092165@qq.com', '中国 广东省 珠海市 金湾区 金湾区大道3号');

-- ----------------------------
-- Table structure for wms_goods
-- ----------------------------
DROP TABLE IF EXISTS `wms_goods`;
CREATE TABLE `wms_goods`  (
  `GOOD_ID` int NOT NULL AUTO_INCREMENT,
  `GOOD_NAME` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `GOOD_RYPE` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `GOOD_SIZE` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `GOOD_VALUE` double NOT NULL,
  PRIMARY KEY (`GOOD_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 106 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wms_goods
-- ----------------------------
INSERT INTO `wms_goods` VALUES (103, '格力空调', '电器', '86*86', 1.85);
INSERT INTO `wms_goods` VALUES (104, '金山软件', '电子产品', '9*9*11', 3.5);
INSERT INTO `wms_goods` VALUES (105, '娃哈哈饮料', '饮料', '312ml', 300);

-- ----------------------------
-- Table structure for wms_operation_record
-- ----------------------------
DROP TABLE IF EXISTS `wms_operation_record`;
CREATE TABLE `wms_operation_record`  (
  `RECORD_ID` int NOT NULL AUTO_INCREMENT,
  `USER_ID` int NOT NULL,
  `USER_NAME` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `OPERATION_NAME` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `OPERATION_TIME` datetime(0) NOT NULL,
  `OPERATION_RESULT` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`RECORD_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wms_operation_record
-- ----------------------------
INSERT INTO `wms_operation_record` VALUES (1, 1001, 'admin', '删除仓库信息', '2021-05-10 04:04:21', '失败');
INSERT INTO `wms_operation_record` VALUES (2, 1001, 'admin', '添加仓库信息', '2021-05-10 04:07:16', '成功');
INSERT INTO `wms_operation_record` VALUES (3, 1001, 'admin', '删除仓库信息', '2021-05-10 04:07:24', '成功');
INSERT INTO `wms_operation_record` VALUES (4, 1001, 'admin', '添加仓库管理员信息', '2021-05-10 04:09:25', '成功');
INSERT INTO `wms_operation_record` VALUES (5, 1001, 'admin', '修改仓库管理员信息', '2021-05-10 04:09:42', '成功');
INSERT INTO `wms_operation_record` VALUES (6, 1001, 'admin', '修改库存记录', '2021-05-12 06:33:43', '成功');

-- ----------------------------
-- Table structure for wms_record_in
-- ----------------------------
DROP TABLE IF EXISTS `wms_record_in`;
CREATE TABLE `wms_record_in`  (
  `RECORD_ID` int NOT NULL AUTO_INCREMENT,
  `RECORD_SUPPLIERID` int NOT NULL,
  `RECORD_GOODID` int NOT NULL,
  `RECORD_NUMBER` int NOT NULL,
  `RECORD_TIME` datetime(0) NOT NULL,
  `RECORD_PERSON` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `RECORD_REPOSITORYID` int NOT NULL,
  PRIMARY KEY (`RECORD_ID`) USING BTREE,
  INDEX `RECORD_SUPPLIERID`(`RECORD_SUPPLIERID`) USING BTREE,
  INDEX `RECORD_GOODID`(`RECORD_GOODID`) USING BTREE,
  INDEX `RECORD_REPOSITORYID`(`RECORD_REPOSITORYID`) USING BTREE,
  CONSTRAINT `wms_record_in_ibfk_1` FOREIGN KEY (`RECORD_SUPPLIERID`) REFERENCES `wms_supplier` (`SUPPLIER_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `wms_record_in_ibfk_2` FOREIGN KEY (`RECORD_GOODID`) REFERENCES `wms_goods` (`GOOD_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `wms_record_in_ibfk_3` FOREIGN KEY (`RECORD_REPOSITORYID`) REFERENCES `wms_respository` (`REPO_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wms_record_in
-- ----------------------------
INSERT INTO `wms_record_in` VALUES (15, 1015, 105, 1000, '2021-05-01 00:00:00', 'admin', 1004);
INSERT INTO `wms_record_in` VALUES (16, 1015, 105, 200, '2021-05-01 00:00:00', 'admin', 1004);

-- ----------------------------
-- Table structure for wms_record_out
-- ----------------------------
DROP TABLE IF EXISTS `wms_record_out`;
CREATE TABLE `wms_record_out`  (
  `RECORD_ID` int NOT NULL AUTO_INCREMENT,
  `RECORD_CUSTOMERID` int NOT NULL,
  `RECORD_GOODID` int NOT NULL,
  `RECORD_NUMBER` int NOT NULL,
  `RECORD_TIME` datetime(0) NOT NULL,
  `RECORD_PERSON` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `RECORD_REPOSITORYID` int NOT NULL,
  PRIMARY KEY (`RECORD_ID`) USING BTREE,
  INDEX `RECORD_CUSTOMERID`(`RECORD_CUSTOMERID`) USING BTREE,
  INDEX `RECORD_GOODID`(`RECORD_GOODID`) USING BTREE,
  INDEX `RECORD_REPOSITORYID`(`RECORD_REPOSITORYID`) USING BTREE,
  CONSTRAINT `wms_record_out_ibfk_1` FOREIGN KEY (`RECORD_CUSTOMERID`) REFERENCES `wms_customer` (`CUSTOMER_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `wms_record_out_ibfk_2` FOREIGN KEY (`RECORD_GOODID`) REFERENCES `wms_goods` (`GOOD_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `wms_record_out_ibfk_3` FOREIGN KEY (`RECORD_REPOSITORYID`) REFERENCES `wms_respository` (`REPO_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wms_record_out
-- ----------------------------
INSERT INTO `wms_record_out` VALUES (7, 1214, 104, 750, '2021-05-01 00:00:00', 'admin', 1003);

-- ----------------------------
-- Table structure for wms_record_storage
-- ----------------------------
DROP TABLE IF EXISTS `wms_record_storage`;
CREATE TABLE `wms_record_storage`  (
  `RECORD_GOODID` int NOT NULL AUTO_INCREMENT,
  `RECORD_REPOSITORY` int NOT NULL,
  `RECORD_NUMBER` int NOT NULL,
  PRIMARY KEY (`RECORD_GOODID`, `RECORD_REPOSITORY`) USING BTREE,
  INDEX `RECORD_REPOSITORY`(`RECORD_REPOSITORY`) USING BTREE,
  CONSTRAINT `wms_record_storage_ibfk_1` FOREIGN KEY (`RECORD_GOODID`) REFERENCES `wms_goods` (`GOOD_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `wms_record_storage_ibfk_2` FOREIGN KEY (`RECORD_REPOSITORY`) REFERENCES `wms_respository` (`REPO_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 106 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wms_record_storage
-- ----------------------------
INSERT INTO `wms_record_storage` VALUES (103, 1005, 10000);
INSERT INTO `wms_record_storage` VALUES (104, 1003, 175);
INSERT INTO `wms_record_storage` VALUES (105, 1004, 2000);

-- ----------------------------
-- Table structure for wms_repo_admin
-- ----------------------------
DROP TABLE IF EXISTS `wms_repo_admin`;
CREATE TABLE `wms_repo_admin`  (
  `REPO_ADMIN_ID` int NOT NULL AUTO_INCREMENT,
  `REPO_ADMIN_NAME` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `REPO_ADMIN_SEX` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `REPO_ADMIN_TEL` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `REPO_ADMIN_ADDRESS` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `REPO_ADMIN_BIRTH` datetime(0) NOT NULL,
  `REPO_ADMIN_REPOID` int NULL DEFAULT NULL,
  PRIMARY KEY (`REPO_ADMIN_ID`) USING BTREE,
  INDEX `REPO_ADMIN_REPOID`(`REPO_ADMIN_REPOID`) USING BTREE,
  CONSTRAINT `wms_repo_admin_ibfk_1` FOREIGN KEY (`REPO_ADMIN_REPOID`) REFERENCES `wms_respository` (`REPO_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1021 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wms_repo_admin
-- ----------------------------
INSERT INTO `wms_repo_admin` VALUES (1018, '何小红', '女', '12345874526', '广州', '2021-05-01 00:00:00', 1004);
INSERT INTO `wms_repo_admin` VALUES (1019, '何小翔', '男', '1234', '韶关', '2021-05-01 00:00:00', 1003);
INSERT INTO `wms_repo_admin` VALUES (1020, '何灿烊', '男', '122345678', '吉林大学珠海学院', '2021-05-10 00:00:00', 1005);

-- ----------------------------
-- Table structure for wms_respository
-- ----------------------------
DROP TABLE IF EXISTS `wms_respository`;
CREATE TABLE `wms_respository`  (
  `REPO_ID` int NOT NULL AUTO_INCREMENT,
  `REPO_ADDRESS` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `REPO_STATUS` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `REPO_AREA` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `REPO_DESC` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`REPO_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1007 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wms_respository
-- ----------------------------
INSERT INTO `wms_respository` VALUES (1003, '珠海市金湾区优服务区', '可用', '11000㎡', '提供服务完整');
INSERT INTO `wms_respository` VALUES (1004, '珠海市香洲区飞速物流区', '可用', '1000㎡', '物流极为便利');
INSERT INTO `wms_respository` VALUES (1005, '珠海市斗门区小街区', '可用', '5000.00㎡', NULL);

-- ----------------------------
-- Table structure for wms_role_action
-- ----------------------------
DROP TABLE IF EXISTS `wms_role_action`;
CREATE TABLE `wms_role_action`  (
  `ACTION_ID` int NOT NULL,
  `ROLE_ID` int NOT NULL,
  PRIMARY KEY (`ACTION_ID`, `ROLE_ID`) USING BTREE,
  INDEX `ROLE_ID`(`ROLE_ID`) USING BTREE,
  CONSTRAINT `wms_role_action_ibfk_1` FOREIGN KEY (`ROLE_ID`) REFERENCES `wms_roles` (`ROLE_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `wms_role_action_ibfk_2` FOREIGN KEY (`ACTION_ID`) REFERENCES `wms_action` (`ACTION_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wms_role_action
-- ----------------------------
INSERT INTO `wms_role_action` VALUES (1, 1);
INSERT INTO `wms_role_action` VALUES (2, 1);
INSERT INTO `wms_role_action` VALUES (3, 1);
INSERT INTO `wms_role_action` VALUES (4, 1);
INSERT INTO `wms_role_action` VALUES (5, 1);
INSERT INTO `wms_role_action` VALUES (6, 1);
INSERT INTO `wms_role_action` VALUES (7, 1);
INSERT INTO `wms_role_action` VALUES (8, 1);
INSERT INTO `wms_role_action` VALUES (9, 1);
INSERT INTO `wms_role_action` VALUES (10, 1);
INSERT INTO `wms_role_action` VALUES (11, 1);
INSERT INTO `wms_role_action` VALUES (12, 1);
INSERT INTO `wms_role_action` VALUES (13, 1);
INSERT INTO `wms_role_action` VALUES (14, 1);
INSERT INTO `wms_role_action` VALUES (15, 1);
INSERT INTO `wms_role_action` VALUES (16, 1);
INSERT INTO `wms_role_action` VALUES (17, 1);
INSERT INTO `wms_role_action` VALUES (18, 1);
INSERT INTO `wms_role_action` VALUES (19, 1);
INSERT INTO `wms_role_action` VALUES (20, 1);
INSERT INTO `wms_role_action` VALUES (21, 1);
INSERT INTO `wms_role_action` VALUES (22, 1);
INSERT INTO `wms_role_action` VALUES (23, 1);
INSERT INTO `wms_role_action` VALUES (24, 1);
INSERT INTO `wms_role_action` VALUES (25, 1);
INSERT INTO `wms_role_action` VALUES (26, 1);
INSERT INTO `wms_role_action` VALUES (27, 1);
INSERT INTO `wms_role_action` VALUES (28, 1);
INSERT INTO `wms_role_action` VALUES (29, 1);
INSERT INTO `wms_role_action` VALUES (30, 1);
INSERT INTO `wms_role_action` VALUES (31, 1);
INSERT INTO `wms_role_action` VALUES (32, 1);
INSERT INTO `wms_role_action` VALUES (33, 1);
INSERT INTO `wms_role_action` VALUES (34, 1);
INSERT INTO `wms_role_action` VALUES (35, 1);
INSERT INTO `wms_role_action` VALUES (36, 1);
INSERT INTO `wms_role_action` VALUES (37, 1);
INSERT INTO `wms_role_action` VALUES (39, 1);
INSERT INTO `wms_role_action` VALUES (40, 1);
INSERT INTO `wms_role_action` VALUES (41, 1);
INSERT INTO `wms_role_action` VALUES (42, 1);
INSERT INTO `wms_role_action` VALUES (43, 1);
INSERT INTO `wms_role_action` VALUES (44, 1);
INSERT INTO `wms_role_action` VALUES (45, 1);
INSERT INTO `wms_role_action` VALUES (46, 1);
INSERT INTO `wms_role_action` VALUES (47, 1);
INSERT INTO `wms_role_action` VALUES (48, 1);
INSERT INTO `wms_role_action` VALUES (4, 2);
INSERT INTO `wms_role_action` VALUES (8, 2);
INSERT INTO `wms_role_action` VALUES (15, 2);
INSERT INTO `wms_role_action` VALUES (38, 2);
INSERT INTO `wms_role_action` VALUES (43, 2);
INSERT INTO `wms_role_action` VALUES (44, 2);
INSERT INTO `wms_role_action` VALUES (45, 2);

-- ----------------------------
-- Table structure for wms_roles
-- ----------------------------
DROP TABLE IF EXISTS `wms_roles`;
CREATE TABLE `wms_roles`  (
  `ROLE_ID` int NOT NULL AUTO_INCREMENT,
  `ROLE_NAME` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ROLE_DESC` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ROLE_URL_PREFIX` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`ROLE_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wms_roles
-- ----------------------------
INSERT INTO `wms_roles` VALUES (1, 'systemAdmin', NULL, 'systemAdmin');
INSERT INTO `wms_roles` VALUES (2, 'commonsAdmin', NULL, 'commonsAdmin');

-- ----------------------------
-- Table structure for wms_supplier
-- ----------------------------
DROP TABLE IF EXISTS `wms_supplier`;
CREATE TABLE `wms_supplier`  (
  `SUPPLIER_ID` int NOT NULL AUTO_INCREMENT,
  `SUPPLIER_NAME` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `SUPPLIER_PERSON` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `SUPPLIER_TEL` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `SUPPLIER_EMAIL` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `SUPPLIER_ADDRESS` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`SUPPLIER_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1016 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wms_supplier
-- ----------------------------
INSERT INTO `wms_supplier` VALUES (1013, '珠海格力电器有限公司', '甲供员', '13777771126', '86827868@126.com', '中国 广东省 珠海市 香洲区 香洲区大道1号');
INSERT INTO `wms_supplier` VALUES (1014, '金山软件有限公司', '乙供员', '13974167256', '23267999@126.com', '中国 广东省 珠海市 斗门区 斗门区大道2号');
INSERT INTO `wms_supplier` VALUES (1015, '娃哈哈饮品有限公司', '丙供员', '26391678', '22390898@qq.com', '中国 广东省 珠海市 金湾区 金湾区大道3号');

-- ----------------------------
-- Table structure for wms_user
-- ----------------------------
DROP TABLE IF EXISTS `wms_user`;
CREATE TABLE `wms_user`  (
  `USER_ID` int NOT NULL AUTO_INCREMENT,
  `USER_USERNAME` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `USER_PASSWORD` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `USER_FIRST_LOGIN` int NOT NULL,
  PRIMARY KEY (`USER_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1021 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wms_user
-- ----------------------------
INSERT INTO `wms_user` VALUES (1001, 'admin', '6f5379e73c1a9eac6163ab8eaec7e41c', 0);
INSERT INTO `wms_user` VALUES (1018, '何小红', '23e666bfe078751035b77e62d45b1b5b', 0);
INSERT INTO `wms_user` VALUES (1019, '何小翔', 'cbbd50301cc62a2cd8361c877e67e7d2', 0);
INSERT INTO `wms_user` VALUES (1020, '何灿烊', 'b9e6d2919c3aa83ad1c340fb56534aab', 0);

-- ----------------------------
-- Table structure for wms_user_role
-- ----------------------------
DROP TABLE IF EXISTS `wms_user_role`;
CREATE TABLE `wms_user_role`  (
  `ROLE_ID` int NOT NULL,
  `USER_ID` int NOT NULL,
  PRIMARY KEY (`ROLE_ID`, `USER_ID`) USING BTREE,
  INDEX `USER_ID`(`USER_ID`) USING BTREE,
  CONSTRAINT `wms_user_role_ibfk_1` FOREIGN KEY (`ROLE_ID`) REFERENCES `wms_roles` (`ROLE_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `wms_user_role_ibfk_2` FOREIGN KEY (`USER_ID`) REFERENCES `wms_user` (`USER_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wms_user_role
-- ----------------------------
INSERT INTO `wms_user_role` VALUES (1, 1001);
INSERT INTO `wms_user_role` VALUES (2, 1018);
INSERT INTO `wms_user_role` VALUES (2, 1019);
INSERT INTO `wms_user_role` VALUES (2, 1020);

SET FOREIGN_KEY_CHECKS = 1;
