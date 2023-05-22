import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.norgianking.chatapp.R
import com.norgianking.chatapp.data.vos.DiscoverVo

class DiscoverListAdapter(  val context: Context) : BaseAdapter() {


    var  discoveryList : MutableList<DiscoverVo> = ArrayList()
    override fun getCount(): Int {
       return discoveryList.size
    }

    override fun getItem(position: Int): Any {

        return  discoveryList[position]
    }

    override fun getItemId(position: Int): Long {

         return  0
    }



    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        // categoryView = LayoutInflater.from(context).inflate(R.layout.activity_heroes, null)
        val listheroView = LayoutInflater.from(context).inflate(R.layout.discover_list, parent, false)
        // val categoryImage: ImageView = categoryView.findViewById(R.id.heroesImageView)
        val title: TextView = listheroView.findViewById(R.id.text_view_discover_name)
        val imageIcon : ImageView = listheroView.findViewById(R.id.image_view_discover_icon)
        val discoverVo : DiscoverVo = discoveryList[position]

        title.text = discoverVo.title
        imageIcon.setImageResource(discoverVo.icon)


        return listheroView
    }
    fun setUsers(chat: List<DiscoverVo>) {
        discoveryList = chat as ArrayList<DiscoverVo>
        notifyDataSetChanged()
    }

}