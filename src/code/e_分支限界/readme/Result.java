package code.e_分支限界.readme;

/**
 * @author GengXuelong
 * @version 1.0
 * {@code Mail} 3349495429@qq.com
 * {@code time} 2023/2/27 12:15
 * {@code className} Result
 * {@code description}:
 *      分支限界
 *      也是在问题解空间中搜索解的一种算法
 *      分支限界通常是找到一个解或者最优解,回溯法是找到所有满足约束条件的解
 *      分支限界主要以广度优先或以函数优先的方式 搜索解空间树
 *      每个活结点只有一次机会成为扩展结点,一次性产生所有儿子结点
 *      这些儿子节点中导致不可行解或导致非最优解的结点被舍弃,其余结点加入活结点表中
 *      ...一直持续到找到所需要的解或者活结点表为空为止
 *      代码框架:
 *      Q = {q0}
 *      void branch(){
 *          while(Q!= null){
 *              select a node q from Q
 *              branch(q,Q1)// 对q进行分支限界,得到Q1儿子结点序列,分支限界时利用约束函数和界函数进行剪枝
 *              add(Q1,Q)
 *          }
 *      }
 *
 *      常见的两种分支搜素方法:
 *      队列式搜索法,fifo搜索法
 *      优先队列搜索法
 *      上界:
 *      UB(v),上确界
 *      下界:
 *      LB(v) ,下确界
 *
 *      极大值问题
 *      极小值问题
 *u对于求最小值的优化问题，
 * 如果UB(v0) = LB(v0)，则直接结束，输出对应于UB(v0)的解即可；
 * 如果节点v的UB(v) = LB(v)，则该节点不用继续搜索，直接用UB(v) 作为其可到达的最优值，对cBest进行更新；
 * 如果找到节点v使得f(v) = LB(v0)或者所有的节点搜索完毕则搜索完毕。
 * cBest 初始等于UB(v0)，找到UB(v)小于cBest，则可以更新cBest ，另外可以减掉LB(v)  cBest的点v。
 *
 * 对于极大值:
 * 如果UB(v0) = LB(v0)，则直接结束，输出对应于LB(v0)的解即可；
 * 如果节点v的UB(v) = LB(v)，则该节点不用继续搜索，直接用LB(v) 作为其可到达的最优值，对cBest进行更新；
 * 如果找到节点v使得f(v) = UB(v0)或者所有的节点搜索完毕 则搜索完毕。
 * cBest 初始等于LB(v0)，找到LB(v)大于cBest，则可以更新cBest， 另外可以减掉UB(v)  cBest的点v。
 *
 *      案例1:0-1背包问题.极大值问题
 *      下界: 按照单位价值的比重由大到小排序,一次装入背包至装不下.--贪心求解
 *      上界: 先把物品大于总容量的去掉,按照单位价值的比重由大到小排序,依次装包
 *          ,最后未装满时,按照未装物品的最大比重尽心换算,将剩余空间完全填充次比重物品.
 *
 *      当LB(v0) = UB(v0)是,答案直接出来,结束程序.
 *
 *      分支限界程序结构: 结点扩展适合采用迭代法,而不是递归法.回溯法适合递归法
 *
 *      案例2: 装载问题.将船的载重容量尽可能装满,极大值问题
 *      上界: UB = cc + r ,当cc+r < bestCC 时,直接剪切
 *      如果cc> bestCC ,则可以直接对bestCC进行更新,而不用非要等到叶子结点
 *
 *      先搜索优先级较高的分支,能尽快朝较好的方向分支,可以较快得到一个较好的解,有利于后面的剪枝
 *      优先队列不能体现层的信息,只能存储到结点中
 *
 *      案例3: 货郎担问题:  极小值问题
 *      问题上界:   贪心法,从起始点,往最小的边对应的结点走,以此方法进行.
 *      问题下界: 重要:
 *      (1) 图临界矩阵每行的最小数相加.
 *      (2) 更好的下界: 每个结点应该至少有两条不同的边进出.故:取 : 每行最小的两个数相加合并后除以二并向上取整
 *      部分解的下界:
 *      本来是每行最小的两个值相加求和并向上取整,现在将已经确定的边×2替换响应的最小值,然后公式不变
 *
 *      案例4: 布线问题
 *
 *      案例5: 最大团问题,极大值问题   重要,回头看!
 *      上界函数:
 *      用cliqueSize代表当前的团的结点数 ,level 层数,根节点为1层
 *      upperSize = cliqueSize + n - level +1
 *      在优先队列中,upperSize同时也是优先级
 *
 *      案例6:批作业调度问题 极小值问题
 *      下界重要:
 *      优先队列,以下界最小为优先级
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
public class Result {
}
