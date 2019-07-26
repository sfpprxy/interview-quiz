/**
 * seven_star.js
 */

 
/**
 * @param bet 复选号码
 * @param prize 开奖号码
 * @return 买彩票的人的中奖等级, 只中一位号码就输出7，一位都没中就输出8
 */
function getPrizeLevel(bet, prize) {
    
    return null
}


/****************以下为测试部分，请勿修改*****************/

function test1() {
    var bet = 
    [ [8, 1],
      [9, 1, 8, 0],
      [0, 2, 3],
      [1, 2, 0],
      [8, 0],
      [4, 8],
      [6, 2, 5] ]
    var prize = [1, 1, 3, 7, 8, 4, 2]
    var prizeLevel = getPrizeLevel(bet, prize)
    if (5 === prizeLevel) {
        console.log("测试1通过")
    } else {
        console.log("测试1失败")
    }
}

function test2() {
    var bet = 
    [ [8, 1],
      [9, 1, 8, 0],
      [0, 2, 3],
      [1, 2, 0],
      [8, 0],
      [4, 8],
      [6, 2, 5] ]
    var prize = [8, 1, 3, 1, 8, 4, 2]
    var prizeLevel = getPrizeLevel(bet, prize)
    if (1 === prizeLevel) {
        console.log("测试2通过")
    } else {
        console.log("测试2失败")
    }
}

function test3() {
    var bet = 
    [ [8, 1],
      [9, 1, 8, 0],
      [0, 2, 3],
      [1, 2, 0],
      [8, 0],
      [4, 8],
      [6, 2, 5] ]
    var prize = [2, 4, 4, 7, 4, 7, 1]
    var prizeLevel = getPrizeLevel(bet, prize)
    if (8 === prizeLevel) {
        console.log("测试3通过")
    } else {
        console.log("测试3失败")
    }
}

function test4() {
    var bet = 
    [ [8, 1],
      [9, 1, 8, 0],
      [0, 2, 3],
      [1, 2, 0],
      [8, 0],
      [4, 8],
      [6, 2, 5] ]
    var prize = [7, 1, 2, 7, 8, 4, 2]
    var prizeLevel = getPrizeLevel(bet, prize)
    if (5 === prizeLevel) {
        console.log("测试4通过")
    } else {
        console.log("测试4失败")
    }
}

test1()
test2()
test3()
test4()
