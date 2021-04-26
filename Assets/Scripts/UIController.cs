using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class UIController : MonoBehaviour
{
    public void Vibrate(int ms)
    {
        Vibration.Vibrate( (long) ms);
    }
}
