package zq.whu.zhangshangwuda.ui.ringer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class OffSilentReceiver extends BroadcastReceiver
{
	@Override
	public void onReceive(Context context, Intent intent) 
	{
		RingerTools rt = new RingerTools(context);
		rt.initAudioManager();
		rt.setSilent(false);
		Toast.makeText(context, "关闭静音", Toast.LENGTH_SHORT).show();
	}
}